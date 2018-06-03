package info.gotest.course.agiledev;

public class Rot13
{
    private static final char ROTATION_DISTANCE = 13;

    private static final char CYCLE_DISTANCE_FROM_Z_TO_A = 26;

    private String convertToNonUmlautUpperCase( String message )
    {
        return message.toUpperCase().replaceAll( "Ä", "AE" ).replaceAll( "Ö", "OE" ).replaceAll( "Ü", "UE" );
    }

    private char encrypt( char character )
    {
        if ( character < 'A' || character > 'Z' )
            return character;

        char cipher = (char) ( character + ROTATION_DISTANCE );
        return cipher > 'Z' ? (char) ( cipher - CYCLE_DISTANCE_FROM_Z_TO_A ) : cipher;
    }

    public String encrypt( String message )
    {
        String preparedMessage = convertToNonUmlautUpperCase( message );
        String cipher = "";
        for ( char character : preparedMessage.toCharArray() )
        {
            cipher += encrypt( character );
        }
        return cipher;
    }
}
