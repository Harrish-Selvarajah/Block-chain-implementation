import java.util.ArrayList;

public class Test {




//        Hash codes are digital signatures
//
//                each block will contain:
//                      List of transactons
//                      prevoius Hash
//                      Current Hash



       ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        String[] firstTransaction = {"Harrish sent 1000 bitcoins to his mother"};
        Block firstBlock = new Block(0, firstTransaction);

        String[] secondTransaction = {"Harrish sent 1000 bitcoins to his Dad"};
        Block secondBlock = new Block(firstBlock.getBlockHash(), secondTransaction);

        System.out.println("First HAsh block:");
        System.out.println(firstBlock.getBlockHash());
        System.out.println("Second Hash Block:");
        System.out.println(secondBlock.getBlockHash());




    }
}
