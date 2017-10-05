
import CB.SoftwareEng.Student;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class TestUserName extends TestCase{
    
    
   public TestUserName( String testName )
   {
       super( testName );
   }

   /**
    * @return the suite of tests being tested
    */
   public static Test suite()
   {
       return new TestSuite(TestUserName.class );
   }

   /**
    * Rigourous Test :-)
    */
   public void testUserName(){
       Student Student = new Student("Ciarán Brogan", 22, "26/09/1995");
       Student.genUserName();
       String UsrName = Student.getUserName();
       
       assertEquals("CiaránBrogan22", UsrName);
    }  
}