package edu.illinois.cs.cogcomp.loreleicoherence;

import edu.illinois.cs.cogcomp.loreleicoherence.Candidate;
import edu.illinois.cs.cogcomp.infer.ilp.GurobiHook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LORELEICoherence{
  public LORELEICoherence(String candDoc){
    parseCandDoc(candDoc);
    //gurobiHook = new GurobiHook(0);
  }

  private void parseCandDoc(String candDoc){
    BufferedReader br = null;
    String line;
    try{
      br = new BufferedReader(new FileReader(candDoc));
      while((line = br.readLine())!=null){
        String[] spline = line.split("\t");
        for (String s : spline){
          System.out.print(s+" ");
        }
        System.out.println();
      }
    }catch(IOException e){
      e.printStackTrace();
    }
  }

  ArrayList<ArrayList<Candidate>> mentions = 
    new ArrayList<ArrayList<Candidate>>();
  //GurobiHook gurobiHook = null;
  GurobiHook gurobiHook = new GurobiHook();
}

