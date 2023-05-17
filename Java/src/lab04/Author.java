package lab04;

public class Author {
    private String name;
    private int birth_year;
    private String email;
    private String nationality;

    public Author() {
    }

    public Author(String name, int birth_year, String email, String nationality) {
        this.name = name;
        this.birth_year = birth_year;
        this.email = email;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public int getBirth_year() {
        return birth_year;
    }

    public String getEmail() {
        return email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", birth_year=" + birth_year +
                ", email='" + email + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author author)) return false;

        if (getBirth_year() != author.getBirth_year()) return false;
        if (getName() != null ? !getName().equals(author.getName()) : author.getName() != null) return false;
        if (getEmail() != null ? !getEmail().equals(author.getEmail()) : author.getEmail() != null) return false;
        return getNationality() != null ? getNationality().equals(author.getNationality()) : author.getNationality() == null;
    }

}
