import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class BlockChain {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 5;

    public static void main(String[] args) {
        blockchain.add(new Block("This is the first block", "0"));
        System.out.println("Trying to mine block 1... ");
        blockchain.get(0).mineBlock(difficulty);

        blockchain.add(new Block("This is the second block", blockchain.get(blockchain.size() - 1).hash));
        System.out.println("Trying to mine block 2... ");
        blockchain.get(1).mineBlock(difficulty);

        blockchain.add(new Block("This is the third block", blockchain.get(blockchain.size() - 1).hash));
        System.out.println("Trying to mine block 3... ");
        blockchain.get(2).mineBlock(difficulty);

        System.out.println("\nBlockchain is Valid: " + isChainValid());

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("\nThe block chain: ");
        System.out.println(blockchainJson);
    }

    public static boolean isChainValid(){
        Block currentBlock;
        Block previousBlock;

        // loop through the blockchain to check hashes
        for (int i = 1; i < blockchain.size(); i++){
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i - 1);
            if (!currentBlock.hash.equals(currentBlock.calculateHash())){
                System.out.println("Current Hashes not equal");
                return false;
            }
            if (!previousBlock.hash.equals(currentBlock.previousHash)){
                System.out.println("Previous Hashes not equal");
                return false;
            }
        }
        return true;
    }
}
