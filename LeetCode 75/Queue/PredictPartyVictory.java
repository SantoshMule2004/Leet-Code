class PredictPartyVictory {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rQueue = new LinkedList<>();
        Queue<Integer> dQueue = new LinkedList<>();

        int sLen = senate.length();
        for(int i=0; i<sLen; i++) {
            if(senate.charAt(i) == 'R')
                rQueue.offer(i);
            else
                dQueue.offer(i);
        }

        while(!rQueue.isEmpty() && !dQueue.isEmpty()) {
            int rFront = rQueue.poll();
            int dFront = dQueue.poll();

            if(rFront < dFront)
                rQueue.offer(rFront + sLen);
            else
                dQueue.offer(dFront + sLen);
        }

        return rQueue.isEmpty() ? "Dire" : "Radiant";
    }
}