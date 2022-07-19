
class AmazonPrime{
    String name;
    String email;
    String phoneNumber;

    boolean isPrime;
    boolean isMusicApplicable;
    boolean isVideoApplicable;
    String membershipValidTill;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getEmail() {
        return email;
    }

    void setEmail(String email) {
        this.email = email;
    }

    String getPhoneNumber() {
        return phoneNumber;
    }

    void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    boolean isPrime() {
        return isPrime;
    }

    void setPrime(boolean prime) {
        isPrime = prime;
    }

    boolean isMusicApplicable() {
        return isMusicApplicable;
    }

    void setMusicApplicable(boolean musicApplicable) {
        isMusicApplicable = musicApplicable;
    }

    boolean isVideoApplicable() {
        return isVideoApplicable;
    }

    void setVideoApplicable(boolean videoApplicable) {
        isVideoApplicable = videoApplicable;
    }

    String getMembershipValidTill() {
        return membershipValidTill;
    }

    void setMembershipValidTill(String membershipValidTill) {
        this.membershipValidTill = membershipValidTill;
    }

    AmazonPrime(String name, String email, String phoneNumber, boolean isPrime, boolean isMusicApplicable, boolean isVideoApplicable, String membershipValidTill) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isPrime = isPrime;
        this.isMusicApplicable = isMusicApplicable;
        this.isVideoApplicable = isVideoApplicable;
        this.membershipValidTill = membershipValidTill;
    }

    void setCustomerDetails(String name, String email, String phoneNumber, boolean isPrime, boolean isMusicApplicable, boolean isVideoApplicable, String membershipValidTill) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isPrime = isPrime;
        this.isMusicApplicable = isMusicApplicable;
        this.isVideoApplicable = isVideoApplicable;
        this.membershipValidTill = membershipValidTill;
    }

    AmazonPrime(boolean isPrime){
        if(isPrime){
            this.isPrime = true;
            this.membershipValidTill = "26 july, 2023";
            this.isMusicApplicable = true;
            this.isVideoApplicable = true;
        }
    }
    AmazonPrime(String name, String phoneNumber, String email, boolean isPrime){
        this(isPrime);

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isPrime = isPrime;

    }
    void showCustomerDetails(){
        System.out.println("Customer Details: ");
        System.out.println(name+" "+ email+" "+ phoneNumber);
        if(isPrime){
            System.out.println("Membership Valid till " + membershipValidTill);
        }
        System.out.println();

    }
}



public class ConstructorChainAmazonPrime {
    public static void main(String[] args){
        AmazonPrime customer1 = new AmazonPrime("Mritunjay jha", "91 1000 2326", "mritunjayjha2014@gmail.com", true);
        AmazonPrime customer2 = new AmazonPrime("Srishti Jha", "133565656", "srishti@gmail.com",false);

        customer2.showCustomerDetails();
        customer1.showCustomerDetails();
    }
}
