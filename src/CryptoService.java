import org.apache.commons.io.output.ByteArrayOutputStream;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.StandardCharsets;

public class CryptoService {

    public String generateRipemd160Digest(String input) throws Exception{

        String digestStr;
        byte[] r = input.getBytes(StandardCharsets.UTF_8);

        RIPEMD160Digest d = new RIPEMD160Digest();
        d.update(r, 0, r.length);

        byte[] o = new byte[d.getDigestSize()];
        d.doFinal(o, 0);

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Hex.encode(o, byteArrayOutputStream);

        digestStr = byteArrayOutputStream.toString("UTF8");

        return digestStr;
    }

    public boolean verifyRipemd160Digest(String plainText, String digest) throws Exception {

        String plainToDigest;
        plainToDigest = this.generateRipemd160Digest(plainText);
        return plainToDigest.equalsIgnoreCase(digest);
    }
}
