package org.anc.lapps.masc.index;

import java.io.*;
import java.util.List;

import org.anc.index.api.Index;
import org.anc.index.core.IndexImpl;

/**
 * @author Keith Suderman
 */
public class MascHeaderIndex implements Index
{
   protected IndexImpl index;

   public MascHeaderIndex() throws IOException
   {
      index = new IndexImpl();
      index.loadMasc3Index();
   }

   public File get(String key)
   {
      return index.get(key);
   }

   public List<String> keys()
   {
      return index.keys();
   }
}
