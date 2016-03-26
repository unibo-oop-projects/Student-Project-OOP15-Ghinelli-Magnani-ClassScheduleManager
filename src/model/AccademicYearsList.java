/**
 * 
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Marti
 * The AccademicYearsList class allows you to build a list of years and return it 
 */
public class AccademicYearsList {
    private final List<AccademicYear> years;
    /**
     * Constructor of the list of years
     */
    public AccademicYearsList(){
        this.years = new ArrayList<AccademicYear>();
    }
    /**
     * Method that adds a year in the list of years
     * @param year
     *          the new academic year
     */
    public void addAccademicYear(final AccademicYear year){
        for(final AccademicYear y : this.years) {
            if(y.equals(year)){
                throw new IllegalArgumentException();
            }
        }
        this.years.add(year);
    }
    /**
     * Method that returns the list of years
     * @return
     *         the complete list of year
     */
    public List<AccademicYear> getAccademicYearsList(){
        return this.years;
    }
}
