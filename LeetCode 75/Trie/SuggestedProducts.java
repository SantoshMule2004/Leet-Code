class SuggestedProducts {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        List<String> suggestions = new ArrayList<>();
    }

    private void insert(TrieNode root, String product) {
        TrieNode node = root;
        for (char ch : product.toCharArray()) {
            int idx = ch - 'a';
            if (node.children[idx] == null) {
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];
            // Maintain up to 3 lexicographically smallest suggestions
            if (node.suggestions.size() < 3) {
                node.suggestions.add(product);
            }
        }
    }

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products); // Sort lexicographically first
        TrieNode root = new TrieNode();

        // Build Trie
        for (String product : products) {
            insert(root, product);
        }

        // Search suggestions
        List<List<String>> ans = new ArrayList<>();
        TrieNode node = root;
        for (char ch : searchWord.toCharArray()) {
            int idx = ch - 'a';
            node = (node == null) ? null : node.children[idx];
            ans.add(node == null ? new ArrayList<>() : node.suggestions);
        }
        return ans;
    }
}
