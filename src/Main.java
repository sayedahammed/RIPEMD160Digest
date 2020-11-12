public class Main {

    public static void main(String[] args) throws Exception {

       String digest;
       CryptoService cryptoService = new CryptoService();

       String otp = String.valueOf(1100);
       digest = cryptoService.generateRipemd160Digest(otp);

       System.out.println(digest);

       System.out.println(cryptoService.verifyRipemd160Digest(otp, digest));
       System.out.println(cryptoService.verifyRipemd160Digest(otp, digest));

    }
}
