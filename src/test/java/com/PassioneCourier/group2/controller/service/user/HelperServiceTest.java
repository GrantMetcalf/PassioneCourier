package com.PassioneCourier.group2.controller.service.user;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.Factory.user.HelperFactory;
import com.PassioneCourier.group2.service.user.HelperServiceInterface;
import org.junit.Assert;
import org.junit.Test;
import com.PassioneCourier.group2.service.user.service.HelperService;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.Assert.*;

public class HelperServiceTest {

    private static HelperServiceInterface helperServiceInterface = HelperService.getEmployerService();
    private static Helper helper = HelperFactory.createHelper(
            1,
            "Jon Smae",
            "02182004747",
            "realjon@com.com",
            "Streety street",
            "Jony5",
            "****",
            true,
            LocalDate.of(1990, 11, 17));

    @Test
    public void create() {
        Helper helperCreate = helperServiceInterface.create(helper);
        Assert.assertEquals(helper.getHelperID(), helperCreate.getHelperID());
    }

    @Test
    public void read() {
        Helper readHelper = helperServiceInterface.read(helper.getHelperID());
    }

    @Test
    public void update() {

        Helper updatedHelper = new Helper.Builder().copy(helper).setMobile("084-2100-819").build();
        updatedHelper = helperServiceInterface.update(updatedHelper);
        assertEquals("084-2100-819", updatedHelper.getMobile());

    }

    @Test
    public void getAll() {

        Set<Helper> helperSet = helperServiceInterface.getAll();
        assertEquals(1, helperSet.size());

    }

    @Test
    public void delete() {

        boolean deletedHelper = helperServiceInterface.delete(helper.getHelperID());

    }

}