
class Employee {

    private String name;
    private  String email;
    private int experience;

    Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getExperience() {
        return this.experience;
    }

}

class Developer extends Employee {
    private String mainLanguage;
    private String[] skills;


    // write constructor

    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills.clone();
    }

    public String getMainLanguage() {
        return this.mainLanguage;
    }

    public String[] getSkills() {
        return this.skills.clone();
    }
}

class DataAnalyst extends Employee {

    private boolean phd;
    private String[] methods;

    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods.clone();
    }

    public boolean isPhd() {
        return this.phd;
    }

    public String[] getMethods() {
        return this.methods.clone();
    }
}