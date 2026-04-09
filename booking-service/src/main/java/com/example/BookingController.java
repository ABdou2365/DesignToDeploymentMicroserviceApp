package com.example;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @PostMapping
    public void createBooking(@RequestBody Booking booking) {
        bookingRepository.save(booking);
    }

    @GetMapping("/{id}")
    public Booking getBooking(@PathVariable("id") Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
    }

}
