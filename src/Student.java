
import java.util.HashSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * This class defines a student
 *
 * @author Wenhou Lu
 * @version 1.0
 * @since 19/11/2015
 */
public class Student {

    private HashSet<String> courses;
    private boolean postgraduate;
    private String educationField;
    private int age;
    private boolean gender;
    private String citizenship;
    private String termResidence;
    private String permanentResidence;
    private String basis;
    private boolean attendanceType;
    private String attendanceMode;
    private String country;
    private String languageAtHome;
    private int yearOfArrival;
    private int SAT;
    private int GMAT;
    private int GRE;
    private int entranceScore;
    private boolean disability;
    private boolean lowIncome;
    private boolean womenInNonTra;
    private boolean remote;
    private String highestEducation;
    private int completionYear;
    private double GPA;

    /**
     * @return the courses
     */
    public HashSet<String> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(HashSet<String> courses) {
        this.courses = courses;
    }

    /**
     * @return the postgraduate
     */
    public boolean isPostgraduate() {
        return postgraduate;
    }

    /**
     * @param postgraduate the postgraduate to set
     */
    public void setPostgraduate(boolean postgraduate) {
        this.postgraduate = postgraduate;
    }

    /**
     * @return the educationField
     */
    public String getEducationField() {
        return educationField;
    }

    /**
     * @param educationField the educationField to set
     */
    public void setEducationField(String educationField) {
        this.educationField = educationField;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the gender
     */
    public boolean isGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(boolean gender) {
        this.gender = gender;
    }

    /**
     * @return the citizenship
     */
    public String getCitizenship() {
        return citizenship;
    }

    /**
     * @param citizenship the citizenship to set
     */
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    /**
     * @return the termResidence
     */
    public String getTermResidence() {
        return termResidence;
    }

    /**
     * @param termResidence the termResidence to set
     */
    public void setTermResidence(String termResidence) {
        this.termResidence = termResidence;
    }

    /**
     * @return the permanentResidence
     */
    public String getPermanentResidence() {
        return permanentResidence;
    }

    /**
     * @param permanentResidence the permanentResidence to set
     */
    public void setPermanentResidence(String permanentResidence) {
        this.permanentResidence = permanentResidence;
    }

    /**
     * @return the basis
     */
    public String getBasis() {
        return basis;
    }

    /**
     * @param basis the basis to set
     */
    public void setBasis(String basis) {
        this.basis = basis;
    }

    /**
     * @return the attendanceType
     */
    public boolean isAttendanceType() {
        return attendanceType;
    }

    /**
     * @param attendanceType the attendanceType to set
     */
    public void setAttendanceType(boolean attendanceType) {
        this.attendanceType = attendanceType;
    }

    /**
     * @return the attendanceMode
     */
    public String getAttendanceMode() {
        return attendanceMode;
    }

    /**
     * @param attendanceMode the attendanceMode to set
     */
    public void setAttendanceMode(String attendanceMode) {
        this.attendanceMode = attendanceMode;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the languageAtHome
     */
    public String getLanguageAtHome() {
        return languageAtHome;
    }

    /**
     * @param languageAtHome the languageAtHome to set
     */
    public void setLanguageAtHome(String languageAtHome) {
        this.languageAtHome = languageAtHome;
    }

    /**
     * @return the yearOfArrival
     */
    public int getYearOfArrival() {
        return yearOfArrival;
    }

    /**
     * @param yearOfArrival the yearOfArrival to set
     */
    public void setYearOfArrival(int yearOfArrival) {
        this.yearOfArrival = yearOfArrival;
    }

    /**
     * @return the SAT
     */
    public int getSAT() {
        return SAT;
    }

    /**
     * @param SAT the SAT to set
     */
    public void setSAT(int SAT) {
        this.SAT = SAT;
    }

    /**
     * @return the GMAT
     */
    public int getGMAT() {
        return GMAT;
    }

    /**
     * @param GMAT the GMAT to set
     */
    public void setGMAT(int GMAT) {
        this.GMAT = GMAT;
    }

    /**
     * @return the GRE
     */
    public int getGRE() {
        return GRE;
    }

    /**
     * @param GRE the GRE to set
     */
    public void setGRE(int GRE) {
        this.GRE = GRE;
    }

    /**
     * @return the entranceScore
     */
    public int getEntranceScore() {
        return entranceScore;
    }

    /**
     * @param entranceScore the entranceScore to set
     */
    public void setEntranceScore(int entranceScore) {
        this.entranceScore = entranceScore;
    }

    /**
     * @return the disability
     */
    public boolean isDisability() {
        return disability;
    }

    /**
     * @param disability the disability to set
     */
    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    /**
     * @return the lowIncome
     */
    public boolean isLowIncome() {
        return lowIncome;
    }

    /**
     * @param lowIncome the lowIncome to set
     */
    public void setLowIncome(boolean lowIncome) {
        this.lowIncome = lowIncome;
    }

    /**
     * @return the womenInNonTra
     */
    public boolean isWomenInNonTra() {
        return womenInNonTra;
    }

    /**
     * @param womenInNonTra the womenInNonTra to set
     */
    public void setWomenInNonTra(boolean womenInNonTra) {
        this.womenInNonTra = womenInNonTra;
    }

    /**
     * @return the remote
     */
    public boolean isRemote() {
        return remote;
    }

    /**
     * @param remote the remote to set
     */
    public void setRemote(boolean remote) {
        this.remote = remote;
    }

    /**
     * @return the highestEducation
     */
    public String getHighestEducation() {
        return highestEducation;
    }

    /**
     * @param highestEducation the highestEducation to set
     */
    public void setHighestEducation(String highestEducation) {
        this.highestEducation = highestEducation;
    }

    /**
     * @return the completionYear
     */
    public int getCompletionYear() {
        return completionYear;
    }

    /**
     * @param completionYear the completionYear to set
     */
    public void setCompletionYear(int completionYear) {
        this.completionYear = completionYear;
    }

    /**
     * @return the GPA
     */
    public double getGPA() {
        return GPA;
    }

    /**
     * @param GPA the GPA to set
     */
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}
