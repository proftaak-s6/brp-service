package nl.fontysproject.brp.model;

import javax.persistence.*;

@Entity(name = "persons")
@NamedQueries({
        @NamedQuery(name = Person.GET_BY_BSN, query = "SELECT p FROM persons p WHERE bsn = :bsn"),
        @NamedQuery(name = Person.GET_BY_ID, query = "SELECT p FROM persons p WHERE id = :id")
})
public class Person {

    public static final String GET_BY_BSN = "GET_BY_BSN";
	public static final String GET_BY_ID = "GET_BY_ID";

    @Id
    private long id;
    private String geslacht;
    private String aanhef;
    private String gegeven_naam;
    private String initialen;
    private String achternaam;
    private String straat;
    private String woonplaats;
    private String provincie;
    private String postcode;
    private String land;
    private String emailadres;
    private String telefoonnummer;
    private String geboortedatum;
    private String bsn;
    private String voertuig;
    private String nameset;
    private String provincie_code;
    private String land_code;
    private String gebruikersnaam;
    private String wachtwoord;
    private String browser_agent;
    private int telefoon_land_code;
    private String meisjesnaam;
    private String sterrenbeeld;
    private String creditcard_type;
    private String creditcard_nummer;
    private String cvv2;
    private String creditcard_verloop;
    private String upstracking;
    private String western_union;
    private String money_gram;
    private String kleur;
    private String beroep;
    private String bedrijf;
    private String website;
    private String bloedtype;
    private String gewicht_lbs;
    private String gewicht_kgs;
    private String lengte_ft;
    private String lengte_cm;
    private String guid;
    private float breedtegraad;
    private float lengtegraad;
    private int leeftijd;

    //region getters & setters

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public String getAanhef() {
        return aanhef;
    }

    public void setAanhef(String aanhef) {
        this.aanhef = aanhef;
    }

    public String getGegeven_naam() {
        return gegeven_naam;
    }

    public void setGegeven_naam(String gegeven_naam) {
        this.gegeven_naam = gegeven_naam;
    }

    public String getInitialen() {
        return initialen;
    }

    public void setInitialen(String initialen) {
        this.initialen = initialen;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String getProvincie() {
        return provincie;
    }

    public void setProvincie(String provincie) {
        this.provincie = provincie;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getEmailadres() {
        return emailadres;
    }

    public void setEmailadres(String emailadres) {
        this.emailadres = emailadres;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(String geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String getBsn() {
        return bsn;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

    public String getVoertuig() {
        return voertuig;
    }

    public void setVoertuig(String voertuig) {
        this.voertuig = voertuig;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameset() {
        return nameset;
    }

    public void setNameset(String nameset) {
        this.nameset = nameset;
    }

    public String getProvincie_code() {
        return provincie_code;
    }

    public void setProvincie_code(String provincie_code) {
        this.provincie_code = provincie_code;
    }

    public String getLand_code() {
        return land_code;
    }

    public void setLand_code(String land_code) {
        this.land_code = land_code;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public void setGebruikersnaam(String gebruikersnaam) {
        this.gebruikersnaam = gebruikersnaam;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public String getBrowser_agent() {
        return browser_agent;
    }

    public void setBrowser_agent(String browser_agent) {
        this.browser_agent = browser_agent;
    }

    public int getTelefoon_land_code() {
        return telefoon_land_code;
    }

    public void setTelefoon_land_code(int telefoon_land_code) {
        this.telefoon_land_code = telefoon_land_code;
    }

    public String getMeisjesnaam() {
        return meisjesnaam;
    }

    public void setMeisjesnaam(String meisjesnaam) {
        this.meisjesnaam = meisjesnaam;
    }

    public String getSterrenbeeld() {
        return sterrenbeeld;
    }

    public void setSterrenbeeld(String sterrenbeeld) {
        this.sterrenbeeld = sterrenbeeld;
    }

    public String getCreditcard_type() {
        return creditcard_type;
    }

    public void setCreditcard_type(String creditcard_type) {
        this.creditcard_type = creditcard_type;
    }

    public String getCreditcard_nummer() {
        return creditcard_nummer;
    }

    public void setCreditcard_nummer(String creditcard_nummer) {
        this.creditcard_nummer = creditcard_nummer;
    }

    public String getCvv2() {
        return cvv2;
    }

    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2;
    }

    public String getCreditcard_verloop() {
        return creditcard_verloop;
    }

    public void setCreditcard_verloop(String creditcard_verloop) {
        this.creditcard_verloop = creditcard_verloop;
    }

    public String getUpstracking() {
        return upstracking;
    }

    public void setUpstracking(String upstracking) {
        this.upstracking = upstracking;
    }

    public String getWestern_union() {
        return western_union;
    }

    public void setWestern_union(String western_union) {
        this.western_union = western_union;
    }

    public String getMoney_gram() {
        return money_gram;
    }

    public void setMoney_gram(String money_gram) {
        this.money_gram = money_gram;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getBeroep() {
        return beroep;
    }

    public void setBeroep(String beroep) {
        this.beroep = beroep;
    }

    public String getBedrijf() {
        return bedrijf;
    }

    public void setBedrijf(String bedrijf) {
        this.bedrijf = bedrijf;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getBloedtype() {
        return bloedtype;
    }

    public void setBloedtype(String bloedtype) {
        this.bloedtype = bloedtype;
    }

    public String getGewicht_lbs() {
        return gewicht_lbs;
    }

    public void setGewicht_lbs(String gewicht_lbs) {
        this.gewicht_lbs = gewicht_lbs;
    }

    public String getGewicht_kgs() {
        return gewicht_kgs;
    }

    public void setGewicht_kgs(String gewicht_kgs) {
        this.gewicht_kgs = gewicht_kgs;
    }

    public String getLengte_ft() {
        return lengte_ft;
    }

    public void setLengte_ft(String lengte_ft) {
        this.lengte_ft = lengte_ft;
    }

    public String getLengte_cm() {
        return lengte_cm;
    }

    public void setLengte_cm(String lengte_cm) {
        this.lengte_cm = lengte_cm;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public float getBreedtegraad() {
        return breedtegraad;
    }

    public void setBreedtegraad(float breedtegraad) {
        this.breedtegraad = breedtegraad;
    }

    public float getLengtegraad() {
        return lengtegraad;
    }

    public void setLengtegraad(float lengtegraad) {
        this.lengtegraad = lengtegraad;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    //endregion
}
