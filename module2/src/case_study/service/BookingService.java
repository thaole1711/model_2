package case_study.service;

import case_study.model.Booking;
import case_study.repository.BookingRepository;
import case_study.repository.IBookingRepository;

import java.util.List;

public class BookingService implements IBookingService {

    IBookingRepository iBookingRepository = new BookingRepository();

    @Override
    public List<Booking> findAll() {
        return List.of();
    }

    @Override
    public void update(Booking booking) {

    }

    @Override
    public void add(Booking booking) {

    }

    @Override
    public boolean findId(String id) {
        return iBookingRepository.findId(id);
    }

    @Override
    public void delete(String id) {

    }
}
