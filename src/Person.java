public final class Person {
    private String firstName;
    private String lastName;
    private Gender gender;

    public Person (String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender= gender;
    }

    @Override
    public boolean equals (Object o){
        Person compPerson = (Person) o;
        if (this == compPerson) {
            return true;
        } else if (this.hashCode()==compPerson.hashCode()) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode(){
        byte[] byteStr =  this.toString().getBytes();
        int hashSubRes = 0;
        for (byte b: byteStr){
            hashSubRes = hashSubRes + Byte.toUnsignedInt(b);
        }
        return Math.abs(hashSubRes);
    }

    @Override
    public String toString () {
        return this.firstName +"_"+ this.lastName +"_"+ this.gender;
    }
}
