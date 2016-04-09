/**
 * 
 */
package model;

import model_interface.ITeaching;

/**
 * The Teaching class shapes the object that will identify a university course 
 * 
 * @author Martina Magnani
 */
public class Teaching implements ITeaching{
    private final String name;
    private final Year year;
    private final Court court;
    
    public Teaching(final String name, final Year year, final Court court){
        if(name == null || year == null){
            throw new IllegalArgumentException("The values can't be null!"); 
        }
        this.name = name;
        this.year = year;
        this.court = court;
    }
    /**
     * Method that returns the name of the subject
     * @return
     *          name
     */
    public String getName() {
        return this.name;
    }
    /**
     * Method that returns the Year of the subject
     * @return
     *          year
     */
    public Year getYear() {
        return this.year;
    }
    /**
     * Method that returns the Court of the subject
     * @return
     *          court
     */
    public Court getCourt() {
        return this.court;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Teaching other = (Teaching) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    public String toString() {
        return this.name + " | " + this.year;
    }
}