package herokuapp_smoketest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        //this class will run the classes below in this order
        C01_Post_CreateBooking.class,
        C02_Put_UpdateBooking.class,
        C03_Get_ReadBooking.class,
        C04_Patch_PartialUpdateBooking.class,
        C05_Delete_DeleteBooking.class,
        C06_Get_ReadBooking_Negative.class
})
public class Runner {
}
//authentication--who you are
//authorization--what you do