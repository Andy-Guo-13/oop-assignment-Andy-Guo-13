public class Flight {

    // Declaring variables
    private Cadet[] cadets;
    private Cadet flightCommander;

    public Flight(Cadet[] cadets, Cadet flightCommander) {
        this.setCadets(cadets);
        this.setFlightCommander(flightCommander);
    }

    // Getters and setters
    public Cadet getFlightCommander() {
        return flightCommander;
    }

    public void setFlightCommander(Cadet flightCommander) {
        this.flightCommander = flightCommander;
    }

    public Cadet[] getCadets() {
        return cadets;
    }

    public void setCadets(Cadet[] cadets) {
        this.cadets = cadets;
    }

    // To string method
    public String toString() {

        // Adding the flight commander toString to the string
        String toPrint = "Flight Commander: " + flightCommander.toString();

        // Adding the individual cadets to the toString
        for (int i = 0; i < cadets.length; i++) {
            toPrint += "\n" + "Cadet " + Integer.toString(i + 1) + ": " + cadets[i].toString();
        }

        // Returning the string
        return toPrint;
    }

    // Adding a cadet to the flight
    public void addCadet(Cadet newCadet) {
        // Taking the length of the cadets array
        int length = this.cadets.length;

        // Declaring a string array 1 longer than the cadets array
        Cadet[] tempArray = new Cadet[length + 1];

        // Counter variable
        int counter = 0;

        // Loading the cadets array into the temporary array
        for (Cadet i : this.cadets) {
            tempArray[counter] = i;
            counter++;
        }

        // Adding the new cadet into the last index of the array
        tempArray[counter] = newCadet;

        // Changing the cadets array to the temporary array
        this.setCadets(tempArray);
    }

    // Removing a cadet from the flight
    public void removeCadet(int index) {
        // Taking the length of the cadets array
        int length = this.cadets.length;

        // Declaring a string array 1 shorter than the cadets array
        Cadet[] tempArray = new Cadet[length - 1];

        // Declaring an adder variable which will be set to 1 once the index is reached
        int adder = 0;

        // Looping for each index of the temp array
        for (int i = 0; i < length - 1; i++) {

            // If the index of the cadet is reached, adder is set to 1
            if (i == index) {
                adder++;
            }

            // Loading cadets into the temp array. If the index is reached, the index of the cadet array is incremented by 1
            tempArray[i] = this.cadets[i + adder];
        }

        // Setting the cadets array to the temporary array
        this.setCadets(tempArray);
    }
}
