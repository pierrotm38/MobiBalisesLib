package org.pedro.android;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * 
 * @author pedro.m
 */
public interface JSONAble
{
  /**
   * 
   * @param json
   * @throws JSONException
   */
  public void fromJSON(final JSONObject json) throws JSONException;

  /**
   * 
   * @return
   * @throws JSONException
   */
  public Object toJSON() throws JSONException;
}
