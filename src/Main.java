public class Main {

    public static void main(String[] args) throws Exception {

       String digest;
       CryptoService cryptoService = new CryptoService();

       digest = cryptoService.generateRipemd160Digest("Hello");

       System.out.println(digest);

       System.out.println(cryptoService.verifyRipemd160Digest("Hello", digest));
       System.out.println(cryptoService.verifyRipemd160Digest("Okay", digest));

    }
}
