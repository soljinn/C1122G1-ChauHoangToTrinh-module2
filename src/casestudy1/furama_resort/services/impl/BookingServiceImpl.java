package casestudy1.furama_resort.services.impl;

import casestudy1.furama_resort.models.BookingModel;
import casestudy1.furama_resort.services.IBookingService;
import casestudy1.furama_resort.utils.ReadWriteFile.ReadWriteFileBooking;
import casestudy1.furama_resort.utils.Regex.Regex;
import casestudy1.furama_resort.utils.UserException.BookingComparator;
import casestudy1.furama_resort.utils.UserException.BookingInfoUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class BookingServiceImpl implements IBookingService {
    static final Scanner scanner = new Scanner(System.in);
    final String PATH_BOOKING = "D:\\Trinh\\CodeGym\\module2\\src\\casestudy1\\furama_resort\\data\\booking.csv";

    @Override
    public void addBooking() {
        TreeSet<BookingModel> bookingModelTreeSet = ReadWriteFileBooking.readFileBooking(PATH_BOOKING);
        String bookingId;
        if (bookingModelTreeSet.isEmpty()) {
            bookingId = "Booking-1";
        } else {
            String[] array = bookingModelTreeSet.last().getBookingID().split(",");
            bookingId = "Booking-" + (Integer.parseInt(array[1] + 1));
        }
        System.out.println("Booking code: " + bookingId);
        System.out.println("Enter start date: ");
        String startDay;
        while (true) {
            try {
                startDay = Regex.getDateFormat();
                if (new SimpleDateFormat("dd/MM/yyyy").parse(startDay).getTime() < new Date().getTime()) {
                    System.out.println("Start date must not be less than current date, please re-enter!");
                }
                break;
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.print("Enter end day: ");
        String endDay;
        while (true) {
            try {
                endDay = Regex.getDateFormat();
                if (new SimpleDateFormat("dd/MM/yyyy").parse(endDay).getTime() <= new SimpleDateFormat("dd/MM/yyyy").parse(startDay).getTime()) {
                    System.out.println("End date must be greater than start date, please re-enter!");
                }
                break;
            } catch (ParseException e) {
                e.printStackTrace();
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }
        String customerID = BookingInfoUtil.getCustomerId();
        String serviceID = BookingInfoUtil.getServiceIDBooking();
        String serviceName = null;
        if (serviceID.contains("VL")) {
            serviceName = "Villa";
        } else {
            serviceName = "Room";
        }
        bookingModelTreeSet.add(new BookingModel(bookingId,startDay,endDay,Integer.parseInt(customerID),Integer.parseInt(serviceID),serviceName));
        ReadWriteFileBooking.writeFileBooking(PATH_BOOKING,bookingModelTreeSet);
        System.out.println("New booking successful!");
    }

    @Override
    public void displayBooking() {
        TreeSet<BookingModel> bookingModelTreeSet = ReadWriteFileBooking.readFileBooking(PATH_BOOKING);
        List<BookingModel> bookingModels = new ArrayList<>();
        bookingModels.addAll(bookingModelTreeSet);
        BookingComparator bookingComparator = new BookingComparator();
        bookingModels.sort(bookingComparator);
        System.out.println("Booking list: ");
        for (BookingModel booking: bookingModels) {
            System.out.println(booking);
        }
    }
}