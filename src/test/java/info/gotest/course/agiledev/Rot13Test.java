package info.gotest.course.agiledev;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Rot13Test
{
    // Signature: public String encrypt( String message )
    //
    // Test Cases:
    // -----------
    // "" -> ""
    // "A" -> "N"
    // "B" -> "O"
    // "a" -> "N"
    // "N" -> "A"
    // "@" -> "@"
    // "_" -> "_"
    // "{" -> "{"
    // "Ä" -> "NR"
    // "ä" -> "NR"
    // "Ö" -> "BR"
    // "Ü" -> "HR"
    // "ß" -> "FF"
    // "ICH saß da!" -> "VPU FNFF QN!"

    Rot13 rot13;

    @BeforeEach
    void createRot13Instance()
    {
        rot13 = new Rot13();
    }

    void assertEncryptionOfMessageEquals( String expectedCipher, String message )
    {
        assertEquals( expectedCipher, rot13.encrypt( message ), "Unexpected encryption of message '" + message + "'." );
    }

    @Test
    void emptyMessage_shouldEncryptToEmptyMessage()
    {
        assertEncryptionOfMessageEquals( "", "" );
    }

    @Test
    void A_shouldEncryptToN()
    {
        assertEncryptionOfMessageEquals( "N", "A" );
    }

    @Test
    void B_shouldEncryptToO()
    {
        assertEncryptionOfMessageEquals( "O", "B" );
    }

    @Test
    void a_shouldEncryptToN()
    {
        assertEncryptionOfMessageEquals( "N", "a" );
    }

    @Test
    void N_shouldEncryptToA()
    {
        assertEncryptionOfMessageEquals( "A", "N" );
    }

    @Test
    void at_shouldEncryptToAt()
    {
        assertEncryptionOfMessageEquals( "@", "@" );
    }

    @Test
    void underscore_shouldEncryptToUnderscore()
    {
        assertEncryptionOfMessageEquals( "_", "_" );
    }

    @Test
    void openCurlyBracket_shouldEncryptToOpenCurlyBracket()
    {
        assertEncryptionOfMessageEquals( "{", "{" );
    }

    @Test
    void Ä_shouldEncryptToNR()
    {
        assertEncryptionOfMessageEquals( "NR", "Ä" );
    }

    @Test
    void ä_shouldEncryptToNR()
    {
        assertEncryptionOfMessageEquals( "NR", "ä" );
    }

    @Test
    void Ö_shouldEncryptToBR()
    {
        assertEncryptionOfMessageEquals( "BR", "Ö" );
    }

    @Test
    void Ü_shouldEncryptToHR()
    {
        assertEncryptionOfMessageEquals( "HR", "Ü" );
    }

    @Test
    void ß_shouldEncryptToFF()
    {
        assertEncryptionOfMessageEquals( "FF", "ß" );
    }

    @Test
    void verificationMessage_shouldEncryptToCorrectCipher()
    {
        assertEncryptionOfMessageEquals( "VPU FNFF QN!", "ICH saß da!" );
    }
}
