package testdome;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShelfTest {
    @Test
    public void shelfCanAcceptAndReturnItem() {
        final Shelf shelf = new Shelf();
        shelf.put("Orange");
        Assert.assertTrue(shelf.take("Orange"));
    }

    @Test
    public void shelfInputEmptyStringAndReturnFalse() {
        final Shelf shelf = new Shelf();
        shelf.put("");
        Assert.assertFalse(shelf.take(""));
    }

    @Test
    public void shelfInputNullValueAndReturnFalse() {
        final Shelf shelf = new Shelf();
        shelf.put(null);
        Assert.assertFalse(shelf.take(null));
    }

    @Test
    public void shelfCanAcceptAndReturnOneTime() {
        //given
        final Shelf shelf = new Shelf();
        shelf.put("Grape");

        //when
        final boolean firstTake = shelf.take("Grape");
        final boolean secondTake = shelf.take("Grape");

        //then
        Assert.assertTrue(firstTake);
        Assert.assertFalse(secondTake);
    }

    @Test
    public void shelfCanDuplicatedValueAndReturn() {
        //given
        final Shelf shelf = new Shelf();
        shelf.put("Grape");
        shelf.put("Grape");

        //when
        final boolean firstTake = shelf.take("Grape");
        final boolean secondTake = shelf.take("Grape");
        final boolean thirdTake = shelf.take("Grape");

        //then
        Assert.assertTrue(firstTake);
        Assert.assertTrue(secondTake);
        Assert.assertFalse(thirdTake);
    }

    @Test
    void test() {
        System.currentTimeMillis();
    }


}
