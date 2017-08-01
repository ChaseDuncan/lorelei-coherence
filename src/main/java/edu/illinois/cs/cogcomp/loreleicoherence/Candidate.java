package edu.illinois.cs.cogcomp.loreleicoherence;

public class Candidate{

  public Candidate(int geoID, String name){
    setGeoID(geoID);
    setNameUTF8(name);
    setNameASCII(name);
  }

  public Candidate(int geoID, String nameUTF8, String nameASCII){
    setGeoID(geoID);
    setNameUTF8(nameUTF8);
    setNameASCII(nameASCII);
  }

  public void setGeoID(int geoID){_geoID=geoID;}
  public void setNameUTF8(String nameUTF8){_nameUTF8 = nameUTF8;}
  public void setNameASCII(String nameASCII){_nameASCII=nameASCII;}

  private int _geoID;
  private String _nameASCII;
  private String _nameUTF8;
 } 
