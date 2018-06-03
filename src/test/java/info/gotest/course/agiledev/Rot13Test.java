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
    // "�" -> "NR"
    // "�" -> "NR"
    // "�" -> "BR"
    // "�" -> "HR"
    // "�" -> "FF"
    // "ICH sa� da!" -> "VPU FNFF QN!"

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
    void �_shouldEncryptToNR()
    {
        assertEncryptionOfMessageEquals( "NR", "�" );
    }

    @Test
    void �_shouldEncryptToNR()
    {
        assertEncryptionOfMessageEquals( "NR", "�" );
    }

    @Test
    void �_shouldEncryptToBR()
    {
        assertEncryptionOfMessageEquals( "BR", "�" );
    }

    @Test
    void �_shouldEncryptToHR()
    {
        assertEncryptionOfMessageEquals( "HR", "�" );
    }

    @Test
    void �_shouldEncryptToFF()
    {
        assertEncryptionOfMessageEquals( "FF", "�" );
    }

    @Test
    void verificationMessage_shouldEncryptToCorrectCipher()
    {
        assertEncryptionOfMessageEquals( "VPU FNFF QN!", "ICH sa� da!" );
    }
}
