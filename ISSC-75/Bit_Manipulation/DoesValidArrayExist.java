public class DoesValidArrayExist {
    public boolean doesValidArrayExist(int[] derived) {
        int Num = 0;
        for(int num : derived)
            Num ^= num;

        return Num == 0;
    }
}
