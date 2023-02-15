package casestudy1.furama_resort.utils.UserException;

import casestudy1.furama_resort.models.BookingModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;

public class BookingComparator implements Comparator<BookingModel> {
    @Override
    public int compare(BookingModel o1, BookingModel o2) {
        try{
            long startDay1 = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getStartDay()).getTime();
            long startDay2 = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getStartDay()).getTime();
            if (startDay1 > startDay2){
                return 1;
            }
            if (startDay1 < startDay2){
                return -1;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            long endDay1 = new SimpleDateFormat("dd/MM/yyyy").parse(o1.getEndDay()).getTime();
            long endDay2 = new SimpleDateFormat("dd/MM/yyyy").parse(o2.getEndDay()).getTime();
            if (endDay1 >endDay2){
                return 1;
            }
            if (endDay1<endDay2){
                return -1;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
