/*
 * This file was automatically generated by EvoSuite
 * Tue Jun 09 11:45:47 GMT 2020
 */

package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.TypeToken;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.mock.java.util.MockGregorianCalendar;
import org.evosuite.runtime.mock.java.util.MockUUID;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TypeAdapters_ESTest extends TypeAdapters_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Class<StringBuffer> class0 = StringBuffer.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newTypeHierarchyFactory(class0, (TypeAdapter<StringBuffer>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<URL> class0 = URL.class;
      Class<Object> class1 = Object.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactoryForMultipleTypes(class1, (Class<?>) class0, (TypeAdapter<? super Object>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
      Class<AtomicInteger> class0 = AtomicInteger.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$8", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("null");
      Class<Integer> class0 = Integer.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"null\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$7", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Gson gson0 = new Gson();
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
      Class<Short> class0 = Short.TYPE;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Byte> class0 = Byte.TYPE;
      try { 
        gson0.fromJson("Ba!;`\"s$-%S@K.'Qo", (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"Ba!\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("s;E[y^7AQ89{");
      Class<URI> class0 = URI.class;
      // Undeclared exception!
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.URISyntaxException: Illegal character in path at index 3: s;E[y^7AQ89{
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$22", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("com.google.gson.internal.ConstructorConstructor");
      Class<Long> class0 = Long.class;
      try { 
        gson0.fromJson((Reader) stringReader0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NumberFormatException: For input string: \"com.google.gson.internal.ConstructorConstructor\"
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$11", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Gson gson0 = mock(Gson.class, new ViolatedAssumptionAnswer());
      ObjectTypeAdapter objectTypeAdapter0 = new ObjectTypeAdapter(gson0);
      Class<URL> class0 = URL.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, class0, (TypeAdapter<? super URL>) objectTypeAdapter0);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Class<Object> class0 = Object.class;
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.newFactory(class0, (TypeAdapter<Object>) null);
      assertNotNull(typeAdapterFactory0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) jsonArray0);
      assertTrue(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("abc");
      String string0 = gson0.toJson((JsonElement) jsonPrimitive0);
      assertEquals("\"abc\"", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      String string0 = gson0.toJson((JsonElement) jsonNull0);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Gson gson0 = new Gson();
      Character character0 = new Character('s');
      JsonElement jsonElement0 = gson0.toJsonTree((Object) character0);
      Class<JsonObject> class0 = JsonObject.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonObject but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.FALSE;
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<GregorianCalendar> class0 = GregorianCalendar.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BEGIN_OBJECT but was BOOLEAN at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toJson((JsonElement) null);
      assertEquals("null", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<JsonArray> class0 = JsonArray.class;
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonObject
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray(9);
      Class<JsonArray> class0 = JsonArray.class;
      JsonArray jsonArray1 = (JsonArray)gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
      assertFalse(jsonArray1.isJsonNull());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.valueOf(true);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<JsonNull> class0 = JsonNull.class;
      try { 
        gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonNull but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<JsonObject> class0 = JsonObject.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonObject but was com.google.gson.JsonNull
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Gson gson0 = new Gson();
      Double double0 = new Double(2072.89912);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) double0);
      Class<JsonArray> class0 = JsonArray.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expected a com.google.gson.JsonArray but was com.google.gson.JsonPrimitive
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$35$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.ITALY;
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) locale0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
      Class<Locale> class0 = Locale.class;
      // Undeclared exception!
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Locale", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Locale> class0 = Locale.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("abc");
      Class<Locale> class0 = Locale.class;
      Locale locale0 = (Locale)gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Float float0 = new Float((-1384.0804614));
      jsonObject0.addProperty("com.google.gson.internal.bind.TypeAdapters$5", (Number) float0);
      Class<Calendar> class0 = Calendar.class;
      Object object0 = gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=0,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=0,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", object0.toString());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Calendar> class0 = Calendar.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Gson gson0 = new Gson();
      UUID uUID0 = MockUUID.randomUUID();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) uUID0);
      assertFalse(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) null);
      Class<UUID> class0 = UUID.class;
      Object object0 = gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<InetAddress> class0 = InetAddress.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URI> class0 = URI.class;
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("en~UJG");
      Class<URI> class0 = URI.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      JsonPrimitive jsonPrimitive1 = (JsonPrimitive)gson0.toJsonTree((Object) object0);
      assertFalse(jsonPrimitive1.isBoolean());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Gson gson0 = new Gson();
      URL uRL0 = MockURL.getFtpExample();
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) uRL0);
      assertTrue(jsonPrimitive0.isString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<URL> class0 = URL.class;
      try { 
        gson0.fromJson("JsonWriter is closed.", class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: JsonWriter
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<URL> class0 = URL.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuffer stringBuffer0 = new StringBuffer();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuffer0);
      Class<UUID> class0 = UUID.class;
      UUID uUID0 = (UUID)gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertEquals((-9079256848728588288L), uUID0.getLeastSignificantBits());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<StringBuffer> class0 = StringBuffer.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<StringBuffer> class0 = StringBuffer.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Gson gson0 = new Gson();
      StringBuilder stringBuilder0 = new StringBuilder(891);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) stringBuilder0);
      Class<InetAddress> class0 = InetAddress.class;
      Inet4Address inet4Address0 = (Inet4Address)gson0.fromJson(jsonElement0, (Class<?>) class0);
      assertFalse(inet4Address0.isMCGlobal());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<StringBuilder> class0 = StringBuilder.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<StringBuilder> class0 = StringBuilder.class;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Gson gson0 = new Gson();
      Boolean boolean0 = Boolean.valueOf(true);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(boolean0);
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals("true", object0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<String> class0 = String.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<String> class0 = String.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive("-");
      Class<Character> class0 = Character.class;
      Character character0 = gson0.fromJson((JsonElement) jsonPrimitive0, class0);
      assertEquals('-', (char)character0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Character> class0 = Character.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Gson gson0 = new Gson();
      StringReader stringReader0 = new StringReader("com.google.gson.internal.bind.TypeAdapters$20");
      Class<Character> class0 = Character.TYPE;
      try { 
        gson0.fromJson((Reader) stringReader0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Expecting character, got: com.google.gson.internal.bind.TypeAdapters$20
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$15", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Long> class0 = Long.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Boolean boolean0 = Boolean.FALSE;
      jsonArray0.add(boolean0);
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected NUMBER but was BOOLEAN at path $[0]
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<AtomicIntegerArray> class0 = AtomicIntegerArray.class;
      AtomicIntegerArray atomicIntegerArray0 = (AtomicIntegerArray)gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
      assertEquals(0, atomicIntegerArray0.length());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Gson gson0 = new Gson();
      Class<Integer> class0 = Integer.TYPE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Short> class0 = Short.TYPE;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Byte> class0 = Byte.class;
      Object object0 = gson0.fromJson((JsonElement) jsonNull0, (Class<?>) class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Gson gson0 = new Gson();
      Float float0 = new Float(0.0);
      JsonPrimitive jsonPrimitive0 = new JsonPrimitive(float0);
      Class<Byte> class0 = Byte.class;
      Object object0 = gson0.fromJson((JsonElement) jsonPrimitive0, (Class<?>) class0);
      assertEquals((byte)0, object0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonObject jsonObject0 = new JsonObject();
      Class<Boolean> class0 = Boolean.TYPE;
      try { 
        gson0.fromJson((JsonElement) jsonObject0, (Type) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was BEGIN_OBJECT at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonNull jsonNull0 = JsonNull.INSTANCE;
      Class<Boolean> class0 = Boolean.class;
      Boolean boolean0 = gson0.fromJson((JsonElement) jsonNull0, class0);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Gson gson0 = new Gson();
      InetAddress inetAddress0 = MockInetAddress.getLoopbackAddress();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) inetAddress0);
      Class<Boolean> class0 = Boolean.class;
      Boolean boolean0 = gson0.fromJson(jsonElement0, class0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Gson gson0 = new Gson();
      BitSet bitSet0 = new BitSet();
      bitSet0.flip(11, 2402);
      JsonArray jsonArray0 = (JsonArray)gson0.toJsonTree((Object) bitSet0);
      assertEquals(2402, jsonArray0.size());
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<BitSet> class0 = BitSet.class;
      JsonArray jsonArray0 = new JsonArray(1519);
      Object object0 = gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
      assertEquals("{}", object0.toString());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Gson gson0 = new Gson();
      Byte byte0 = new Byte((byte)40);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) byte0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Gson gson0 = new Gson();
      Short short0 = new Short((short)9);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) short0);
      assertFalse(jsonElement0.isJsonObject());
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicIntegerArray atomicIntegerArray0 = new AtomicIntegerArray(84);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicIntegerArray0);
      Class<AtomicBoolean> class0 = AtomicBoolean.class;
      try { 
        gson0.fromJson(jsonElement0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected BOOLEAN but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicBoolean atomicBoolean0 = new AtomicBoolean(true);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) atomicBoolean0);
      assertTrue(jsonPrimitive0.isBoolean());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Gson gson0 = new Gson();
      AtomicInteger atomicInteger0 = new AtomicInteger(1473);
      JsonElement jsonElement0 = gson0.toJsonTree((Object) atomicInteger0);
      assertFalse(jsonElement0.isJsonArray());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonElement jsonElement0 = gson0.toJsonTree((Object) gson0);
      JsonElement jsonElement1 = gson0.toJsonTree((Object) jsonElement0);
      assertTrue(jsonElement1.equals((Object)jsonElement0));
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Gson gson0 = new Gson();
      Class<Character> class0 = Character.TYPE;
      // Undeclared exception!
      try { 
        gson0.toJsonTree((Object) class0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Attempted to serialize java.lang.Class: char. Forgot to register a type adapter?
         //
         verifyException("com.google.gson.internal.bind.TypeAdapters$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Gson gson0 = new Gson();
      MockGregorianCalendar mockGregorianCalendar0 = new MockGregorianCalendar(8, 81, 46, 5, 84);
      gson0.toJsonTree((Object) mockGregorianCalendar0);
      assertEquals("org.evosuite.runtime.mock.java.util.MockGregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=8,MONTH=81,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=46,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=84,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", mockGregorianCalendar0.toString());
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Gson gson0 = new Gson();
      TypeAdapterFactory typeAdapterFactory0 = TypeAdapters.BOOLEAN_FACTORY;
      Class<Float> class0 = Float.class;
      TypeToken<Float> typeToken0 = TypeToken.get(class0);
      TreeTypeAdapter<Float> treeTypeAdapter0 = new TreeTypeAdapter<Float>((JsonSerializer<Float>) null, (JsonDeserializer<Float>) null, gson0, typeToken0, typeAdapterFactory0);
      TypeAdapterFactory typeAdapterFactory1 = TypeAdapters.newFactory(typeToken0, (TypeAdapter<Float>) treeTypeAdapter0);
      assertFalse(typeAdapterFactory1.equals((Object)typeAdapterFactory0));
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Gson gson0 = new Gson();
      String string0 = gson0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Gson gson0 = new Gson();
      JsonArray jsonArray0 = new JsonArray();
      Class<Currency> class0 = Currency.class;
      try { 
        gson0.fromJson((JsonElement) jsonArray0, (Class<?>) class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable: Expected STRING but was BEGIN_ARRAY at path $
         //
         verifyException("com.google.gson.Gson", e);
      }
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Gson gson0 = new Gson();
      Locale locale0 = Locale.TAIWAN;
      Currency currency0 = Currency.getInstance(locale0);
      JsonPrimitive jsonPrimitive0 = (JsonPrimitive)gson0.toJsonTree((Object) currency0);
      assertFalse(jsonPrimitive0.isNumber());
  }
}
