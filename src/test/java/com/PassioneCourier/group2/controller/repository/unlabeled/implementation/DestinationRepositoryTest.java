package com.PassioneCourier.group2.controller.repository.unlabeled.implementation;

import com.PassioneCourier.group2.Entity.unlabeled.Destination;
import com.PassioneCourier.group2.Factory.unlabeled.DestinationFactory;
import com.PassioneCourier.group2.repository.unlabeled.implementation.DestinationRepository;
import com.PassioneCourier.group2.repository.unlabeled.implementation.DestinationRepositoryInterface;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DestinationRepositoryTest {
    private static DestinationRepositoryInterface destinationRepositoryInterface = new DestinationRepository();
    private Destination destination = DestinationFactory.createDestination("PennyTimbers", "Africa", "South Africa", 1623);



    @Test
    public void testGetAll() {
        {
            System.out.println(destinationRepositoryInterface.getAll());
        }

    }
@Test
    public void testCreate() {
    Destination create = destinationRepositoryInterface.create(destination);
    assertEquals(destination.getName(), create.getName());
    System.out.println("Created: " + create);

    }
@Test
    public void testRead() {
    Destination read = destinationRepositoryInterface.read(destination.getName());
    System.out.println("Read: " + read);

    }
@Test
    public void testUpdate() {
    Destination update = new Destination.DestinationBuilder().
            copy(destination).setName("Fish Hoek").setState("Free state").
            setCountry("").
            setZip_code(8005).build();
    update = destinationRepositoryInterface.update(update);
    System.out.println("Updated: " + update);
}

@Test
    public void testDelete() {
    destinationRepositoryInterface.delete(destination.getName());
    System.out.println("Deleted: " + destinationRepositoryInterface);
    }
}
