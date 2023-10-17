package lab2;
class Author {
    private final String name;
    private String email;
    public void setEmail(String email) {
        this.email = email;
    }
    private final char gender;
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    @Override
    public String toString() {
        return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";    }
}

public class Tester {
    public static void main(String[] args) {
        Author author1 = new Author("Kirill", "you", '-');
        String author1name= author1.getName();
        System.out.println(author1name);
        System.out.println(author1.toString());
        author1.setEmail("star");
        System.out.println(author1);
        String author1Email= author1.getEmail();
        System.out.println(author1Email);
    }
}
