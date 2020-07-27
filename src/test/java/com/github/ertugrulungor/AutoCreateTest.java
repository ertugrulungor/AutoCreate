package com.github.ertugrulungor;

import com.github.ertugrulungor.testclass.*;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.OutputTimeUnit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class AutoCreateTest {
    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_boolean_using_create() {
        Boolean objectBoolean = AutoCreate.build(Boolean.class).create();
        assertNotNull(objectBoolean);
        assertTrue(objectBoolean);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_boolean_list_using_create_many() {
        List<Boolean> objectBooleans = AutoCreate.build(Boolean.class).createMany();
        assertNotNull(objectBooleans);
        assertTrue(objectBooleans.get(0));
        assertTrue(objectBooleans.get(1));
        assertTrue(objectBooleans.get(2));
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_boolean_using_create() {
        boolean primitiveBoolean = AutoCreate.build(boolean.class).create();
        assertTrue(primitiveBoolean);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_boolean_array_using_create() {
        boolean[] primitiveBooleans = AutoCreate.build(boolean[].class).create();
        assertNotNull(primitiveBooleans);
        assertTrue(primitiveBooleans[0]);
        assertTrue(primitiveBooleans[1]);
        assertTrue(primitiveBooleans[2]);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_byte_using_create() {
        Byte objectByte = AutoCreate.build(Byte.class).create();
        assertNotNull(objectByte);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_byte_list_using_create_many() {
        List<Byte> objectBytes = AutoCreate.build(Byte.class).createMany();
        assertNotNull(objectBytes);
        assertNotNull(objectBytes.get(0));
        assertNotNull(objectBytes.get(1));
        assertNotNull(objectBytes.get(2));
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_byte_array_using_create() {
        byte[] primitiveBytes = AutoCreate.build(byte[].class).create();
        assertNotNull(primitiveBytes);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_character_using_create() {
        Character objectCharacter = AutoCreate.build(Character.class).create();
        assertNotNull(objectCharacter);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_character_list_using_create_many() {
        List<Character> objectCharacters = AutoCreate.build(Character.class).createMany();
        assertNotNull(objectCharacters);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_character_array_using_create() {
        char[] primitiveCharacters = AutoCreate.build(char[].class).create();
        assertNotNull(primitiveCharacters);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_date_using_create() {
        Date objectDate = AutoCreate.build(Date.class).create();
        assertNotNull(objectDate);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_date_list_using_create_many() {
        List<Date> objectDates = AutoCreate.build(Date.class).createMany();
        assertNotNull(objectDates);
        assertNotNull(objectDates.get(0));
        assertNotNull(objectDates.get(1));
        assertNotNull(objectDates.get(2));
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_double_using_create() {
        Double objectDouble = AutoCreate.build(Double.class).create();
        assertNotNull(objectDouble);
        assertTrue(objectDouble > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_double_list_using_create_many() {
        List<Double> objectDoubles = AutoCreate.build(Double.class).createMany();
        assertNotNull(objectDoubles);
        assertTrue(objectDoubles.get(0) > 0);
        assertTrue(objectDoubles.get(1) > 0);
        assertTrue(objectDoubles.get(2) > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_double_using_create() {
        boolean primitiveDouble = AutoCreate.build(boolean.class).create();
        assertTrue(primitiveDouble);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_double_array_using_create() {
        boolean[] primitiveDoubles = AutoCreate.build(boolean[].class).create();
        assertNotNull(primitiveDoubles);
        assertTrue(primitiveDoubles[0]);
        assertTrue(primitiveDoubles[1]);
        assertTrue(primitiveDoubles[2]);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_float_using_create() {
        Float objectFloat = AutoCreate.build(Float.class).create();
        assertNotNull(objectFloat);
        assertTrue(objectFloat > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_float_list_using_create_many() {
        List<Float> objectFloats = AutoCreate.build(Float.class).createMany();
        assertNotNull(objectFloats);
        assertTrue(objectFloats.get(0) > 0);
        assertTrue(objectFloats.get(1) > 0);
        assertTrue(objectFloats.get(2) > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_float_using_create() {
        float primitiveFloat = AutoCreate.build(float.class).create();
        assertTrue(primitiveFloat > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_float_array_using_create() {
        float[] primitiveFloats = AutoCreate.build(float[].class).create();
        assertNotNull(primitiveFloats);
        assertTrue(primitiveFloats[0] > 0);
        assertTrue(primitiveFloats[1] > 0);
        assertTrue(primitiveFloats[2] > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_integer_using_create() {
        Integer objectInteger = AutoCreate.build(Integer.class).create();
        assertNotNull(objectInteger);
        assertTrue(objectInteger > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_integer_list_using_create_many() {
        List<Integer> objectIntegers = AutoCreate.build(Integer.class).createMany();
        assertNotNull(objectIntegers);
        assertTrue(objectIntegers.get(0) > 0);
        assertTrue(objectIntegers.get(1) > 0);
        assertTrue(objectIntegers.get(2) > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_integer_using_create() {
        int primitiveInteger = AutoCreate.build(int.class).create();
        assertTrue(primitiveInteger > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_integer_array_using_create() {
        int[] primitiveIntegers = AutoCreate.build(int[].class).create();
        assertNotNull(primitiveIntegers);
        assertTrue(primitiveIntegers[0] > 0);
        assertTrue(primitiveIntegers[1] > 0);
        assertTrue(primitiveIntegers[2] > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_long_using_create() {
        Long objectLong = AutoCreate.build(Long.class).create();
        assertNotNull(objectLong);
        assertTrue(objectLong > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_long_list_using_create_many() {
        List<Long> objectLongs = AutoCreate.build(Long.class).createMany();
        assertNotNull(objectLongs);
        assertTrue(objectLongs.get(0) > 0);
        assertTrue(objectLongs.get(1) > 0);
        assertTrue(objectLongs.get(2) > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_long_using_create() {
        long primitiveLong = AutoCreate.build(long.class).create();
        assertTrue(primitiveLong > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_long_array_using_create() {
        long[] primitiveLongs = AutoCreate.build(long[].class).create();
        assertNotNull(primitiveLongs);
        assertTrue(primitiveLongs[0] > 0);
        assertTrue(primitiveLongs[1] > 0);
        assertTrue(primitiveLongs[2] > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_short_using_create() {
        Short objectShort = AutoCreate.build(Short.class).create();
        assertNotNull(objectShort);
        assertTrue(objectShort > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_short_list_using_create_many() {
        List<Short> objectShorts = AutoCreate.build(Short.class).createMany();
        assertNotNull(objectShorts);
        assertTrue(objectShorts.get(0) > 0);
        assertTrue(objectShorts.get(1) > 0);
        assertTrue(objectShorts.get(2) > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_short_using_create() {
        short primitiveShort = AutoCreate.build(short.class).create();
        assertTrue(primitiveShort > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_primitive_short_array_using_create() {
        short[] primitiveShorts = AutoCreate.build(short[].class).create();
        assertNotNull(primitiveShorts);
        assertTrue(primitiveShorts[0] > 0);
        assertTrue(primitiveShorts[1] > 0);
        assertTrue(primitiveShorts[2] > 0);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_string_using_create() {
        String objectString = AutoCreate.build(String.class).create();
        assertNotNull(objectString);
        assertTrue(StringUtils.isNotBlank(objectString));
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_string_list_using_create_many() {
        List<String> objectString = AutoCreate.build(String.class).createMany();
        assertNotNull(objectString);
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_boolean_using_create() {
        ClassContainsBoolean classContainsBoolean = AutoCreate.build(ClassContainsBoolean.class).create();

        assertNotNull(classContainsBoolean);
        assertNotNull(classContainsBoolean.getObjectBoolean());
        assertNotNull(classContainsBoolean.getObjectBooleanArray());
        assertNotNull(classContainsBoolean.getPrimitiveBooleanArray());
        assertNotNull(classContainsBoolean.getObjectBooleanList());

        assertEquals(3, classContainsBoolean.getObjectBooleanArray().length);
        assertEquals(3, classContainsBoolean.getPrimitiveBooleanArray().length);
        assertEquals(3, classContainsBoolean.getObjectBooleanList().size());

        assertTrue(classContainsBoolean.getObjectBoolean());
        assertTrue(classContainsBoolean.isPrimitiveBoolean());
        for (int i = 0; i < 3; i++) {
            assertTrue(classContainsBoolean.getObjectBooleanArray()[i]);
            assertTrue(classContainsBoolean.getPrimitiveBooleanArray()[i]);
            assertTrue(classContainsBoolean.getObjectBooleanList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_boolean_using_with_and_create() {
        ClassContainsBoolean classContainsBoolean = AutoCreate.build(ClassContainsBoolean.class)
                .with(x -> x.setObjectBoolean(false))
                .with(x -> x.setObjectBooleanArray(new Boolean[]{false, false, false}))
                .with(x -> x.setObjectBooleanList(new ArrayList<Boolean>() {{
                    add(false);
                    add(false);
                    add(false);
                }}))
                .with(x -> x.setPrimitiveBoolean(false))
                .with(x -> x.setPrimitiveBooleanArray(new boolean[]{false, false, false}))
                .create();

        assertNotNull(classContainsBoolean);
        assertNotNull(classContainsBoolean.getObjectBoolean());
        assertNotNull(classContainsBoolean.getObjectBooleanArray());
        assertNotNull(classContainsBoolean.getPrimitiveBooleanArray());
        assertNotNull(classContainsBoolean.getObjectBooleanList());

        assertEquals(3, classContainsBoolean.getObjectBooleanArray().length);
        assertEquals(3, classContainsBoolean.getPrimitiveBooleanArray().length);
        assertEquals(3, classContainsBoolean.getObjectBooleanList().size());

        assertFalse(classContainsBoolean.getObjectBoolean());
        assertFalse(classContainsBoolean.isPrimitiveBoolean());
        for (int i = 0; i < 3; i++) {
            assertFalse(classContainsBoolean.getObjectBooleanArray()[i]);
            assertFalse(classContainsBoolean.getPrimitiveBooleanArray()[i]);
            assertFalse(classContainsBoolean.getObjectBooleanList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_boolean_using_create_many() {
        List<ClassContainsBoolean> classContainsBooleans = AutoCreate.build(ClassContainsBoolean.class).createMany();

        assertEquals(3, classContainsBooleans.size());
        for (ClassContainsBoolean classContainsBoolean : classContainsBooleans) {
            assertNotNull(classContainsBoolean);
            assertNotNull(classContainsBoolean.getObjectBoolean());
            assertNotNull(classContainsBoolean.getObjectBooleanArray());
            assertNotNull(classContainsBoolean.getPrimitiveBooleanArray());
            assertNotNull(classContainsBoolean.getObjectBooleanList());

            assertEquals(3, classContainsBoolean.getObjectBooleanArray().length);
            assertEquals(3, classContainsBoolean.getPrimitiveBooleanArray().length);
            assertEquals(3, classContainsBoolean.getObjectBooleanList().size());

            assertTrue(classContainsBoolean.getObjectBoolean());
            assertTrue(classContainsBoolean.isPrimitiveBoolean());
            for (int i = 0; i < 3; i++) {
                assertTrue(classContainsBoolean.getObjectBooleanArray()[i]);
                assertTrue(classContainsBoolean.getPrimitiveBooleanArray()[i]);
                assertTrue(classContainsBoolean.getObjectBooleanList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_boolean_using_with_and_create_many() {
        List<ClassContainsBoolean> classContainsBooleans = AutoCreate.build(ClassContainsBoolean.class)
                .with(x -> x.setObjectBoolean(true))
                .with(x -> x.setObjectBooleanArray(new Boolean[]{true, true, true}))
                .with(x -> x.setObjectBooleanList(new ArrayList<Boolean>() {{
                    add(true);
                    add(true);
                    add(true);
                }}))
                .with(x -> x.setPrimitiveBoolean(true))
                .with(x -> x.setPrimitiveBooleanArray(new boolean[]{true, true, true}))
                .createMany();

        for (ClassContainsBoolean classContainsBoolean : classContainsBooleans) {
            assertNotNull(classContainsBoolean);
            assertNotNull(classContainsBoolean.getObjectBoolean());
            assertNotNull(classContainsBoolean.getObjectBooleanArray());
            assertNotNull(classContainsBoolean.getPrimitiveBooleanArray());
            assertNotNull(classContainsBoolean.getObjectBooleanList());

            assertEquals(3, classContainsBoolean.getObjectBooleanArray().length);
            assertEquals(3, classContainsBoolean.getPrimitiveBooleanArray().length);
            assertEquals(3, classContainsBoolean.getObjectBooleanList().size());

            assertTrue(classContainsBoolean.getObjectBoolean());
            assertTrue(classContainsBoolean.isPrimitiveBoolean());
            for (int i = 0; i < 3; i++) {
                assertTrue(classContainsBoolean.getObjectBooleanArray()[i]);
                assertTrue(classContainsBoolean.getPrimitiveBooleanArray()[i]);
                assertTrue(classContainsBoolean.getObjectBooleanList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_byte_using_create() {
        ClassContainsByte classContainsByte = AutoCreate.build(ClassContainsByte.class).create();

        assertNotNull(classContainsByte);
        assertNotNull(classContainsByte.getObjectByte());
        assertNotNull(classContainsByte.getObjectByteArray());
        assertNotNull(classContainsByte.getPrimitiveByteArray());
        assertNotNull(classContainsByte.getObjectByteList());

        assertEquals(3, classContainsByte.getObjectByteArray().length);
        assertEquals(3, classContainsByte.getPrimitiveByteArray().length);
        assertEquals(3, classContainsByte.getObjectByteList().size());
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_byte_using_with_and_create() {
        byte byteExample = (byte) Character.getNumericValue('A');
        ClassContainsByte classContainsByte = AutoCreate.build(ClassContainsByte.class)
                .with(x -> x.setObjectByte(byteExample))
                .with(x -> x.setObjectByteArray(new Byte[]{byteExample, byteExample, byteExample}))
                .with(x -> x.setObjectByteList(new ArrayList<Byte>() {{
                    add(byteExample);
                    add(byteExample);
                    add(byteExample);
                }}))
                .with(x -> x.setPrimitiveByte(byteExample))
                .with(x -> x.setPrimitiveByteArray(new byte[]{byteExample, byteExample, byteExample}))
                .create();

        assertNotNull(classContainsByte);
        assertNotNull(classContainsByte.getObjectByte());
        assertNotNull(classContainsByte.getObjectByteArray());
        assertNotNull(classContainsByte.getPrimitiveByteArray());
        assertNotNull(classContainsByte.getObjectByteList());

        assertEquals(3, classContainsByte.getObjectByteArray().length);
        assertEquals(3, classContainsByte.getPrimitiveByteArray().length);
        assertEquals(3, classContainsByte.getObjectByteList().size());

        assertEquals(byteExample, classContainsByte.getObjectByte());
        assertEquals(byteExample, classContainsByte.getPrimitiveByte());
        for (int i = 0; i < 3; i++) {
            assertEquals(byteExample, classContainsByte.getObjectByteArray()[i]);
            assertEquals(byteExample, classContainsByte.getPrimitiveByteArray()[i]);
            assertEquals(byteExample, classContainsByte.getObjectByteList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_byte_using_create_many() {
        List<ClassContainsByte> classContainsBytes = AutoCreate.build(ClassContainsByte.class).createMany();

        for (ClassContainsByte classContainsByte : classContainsBytes) {
            assertNotNull(classContainsByte);
            assertNotNull(classContainsByte.getObjectByte());
            assertNotNull(classContainsByte.getObjectByteArray());
            assertNotNull(classContainsByte.getPrimitiveByteArray());
            assertNotNull(classContainsByte.getObjectByteList());

            assertEquals(3, classContainsByte.getObjectByteArray().length);
            assertEquals(3, classContainsByte.getPrimitiveByteArray().length);
            assertEquals(3, classContainsByte.getObjectByteList().size());
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_byte_using_with_and_create_many() {
        byte byteExample = (byte) Character.getNumericValue('A');
        List<ClassContainsByte> classContainsBytes = AutoCreate.build(ClassContainsByte.class)
                .with(x -> x.setObjectByte(byteExample))
                .with(x -> x.setObjectByteArray(new Byte[]{byteExample, byteExample, byteExample}))
                .with(x -> x.setObjectByteList(new ArrayList<Byte>() {{
                    add(byteExample);
                    add(byteExample);
                    add(byteExample);
                }}))
                .with(x -> x.setPrimitiveByte(byteExample))
                .with(x -> x.setPrimitiveByteArray(new byte[]{byteExample, byteExample, byteExample}))
                .createMany();

        for (ClassContainsByte classContainsByte : classContainsBytes) {
            assertNotNull(classContainsByte);
            assertNotNull(classContainsByte.getObjectByte());
            assertNotNull(classContainsByte.getObjectByteArray());
            assertNotNull(classContainsByte.getPrimitiveByteArray());
            assertNotNull(classContainsByte.getObjectByteList());

            assertEquals(3, classContainsByte.getObjectByteArray().length);
            assertEquals(3, classContainsByte.getPrimitiveByteArray().length);
            assertEquals(3, classContainsByte.getObjectByteList().size());

            assertEquals(byteExample, classContainsByte.getObjectByte());
            assertEquals(byteExample, classContainsByte.getPrimitiveByte());
            for (int i = 0; i < 3; i++) {
                assertEquals(byteExample, classContainsByte.getObjectByteArray()[i]);
                assertEquals(byteExample, classContainsByte.getPrimitiveByteArray()[i]);
                assertEquals(byteExample, classContainsByte.getObjectByteList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_char_using_create() {
        ClassContainsChar classContainsChar = AutoCreate.build(ClassContainsChar.class).create();

        assertNotNull(classContainsChar);
        assertNotNull(classContainsChar.getObjectChar());
        assertNotNull(classContainsChar.getObjectCharArray());
        assertNotNull(classContainsChar.getPrimitiveCharArray());
        assertNotNull(classContainsChar.getObjectCharList());

        assertEquals(3, classContainsChar.getObjectCharArray().length);
        assertEquals(3, classContainsChar.getPrimitiveCharArray().length);
        assertEquals(3, classContainsChar.getObjectCharList().size());

        assertNotEquals(Character.MIN_VALUE, classContainsChar.getObjectChar());
        assertNotEquals(Character.MIN_VALUE, classContainsChar.getPrimitiveChar());
        for (int i = 0; i < 3; i++) {
            assertNotEquals(Character.MIN_VALUE, classContainsChar.getObjectCharArray()[i]);
            assertNotEquals(Character.MIN_VALUE, classContainsChar.getPrimitiveCharArray()[i]);
            assertNotEquals(Character.MIN_VALUE, classContainsChar.getObjectCharList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_char_using_with_and_create() {
        ClassContainsChar classContainsChar = AutoCreate.build(ClassContainsChar.class)
                .with(x -> x.setObjectChar('A'))
                .with(x -> x.setObjectCharArray(new Character[]{'A', 'A', 'A'}))
                .with(x -> x.setObjectCharList(new ArrayList<Character>() {{
                    add('A');
                    add('A');
                    add('A');
                }}))
                .with(x -> x.setPrimitiveChar('A'))
                .with(x -> x.setPrimitiveCharArray(new char[]{'A', 'A', 'A'}))
                .create();

        assertNotNull(classContainsChar);
        assertNotNull(classContainsChar.getObjectChar());
        assertNotNull(classContainsChar.getObjectCharArray());
        assertNotNull(classContainsChar.getPrimitiveCharArray());
        assertNotNull(classContainsChar.getObjectCharList());

        assertEquals(3, classContainsChar.getObjectCharArray().length);
        assertEquals(3, classContainsChar.getPrimitiveCharArray().length);
        assertEquals(3, classContainsChar.getObjectCharList().size());

        assertEquals('A', classContainsChar.getObjectChar());
        assertEquals('A', classContainsChar.getPrimitiveChar());
        for (int i = 0; i < 3; i++) {
            assertEquals('A', classContainsChar.getObjectCharArray()[i]);
            assertEquals('A', classContainsChar.getPrimitiveCharArray()[i]);
            assertEquals('A', classContainsChar.getObjectCharList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_char_using_create_many() {
        List<ClassContainsChar> classContainsChars = AutoCreate.build(ClassContainsChar.class).createMany();
        for (ClassContainsChar classContainsChar : classContainsChars) {
            assertNotNull(classContainsChar);
            assertNotNull(classContainsChar.getObjectChar());
            assertNotNull(classContainsChar.getObjectCharArray());
            assertNotNull(classContainsChar.getPrimitiveCharArray());
            assertNotNull(classContainsChar.getObjectCharList());

            assertEquals(3, classContainsChar.getObjectCharArray().length);
            assertEquals(3, classContainsChar.getPrimitiveCharArray().length);
            assertEquals(3, classContainsChar.getObjectCharList().size());

            assertNotEquals(Character.MIN_VALUE, classContainsChar.getObjectChar());
            assertNotEquals(Character.MIN_VALUE, classContainsChar.getPrimitiveChar());
            for (int i = 0; i < 3; i++) {
                assertNotEquals(Character.MIN_VALUE, classContainsChar.getObjectCharArray()[i]);
                assertNotEquals(Character.MIN_VALUE, classContainsChar.getPrimitiveCharArray()[i]);
                assertNotEquals(Character.MIN_VALUE, classContainsChar.getObjectCharList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_char_using_with_and_create_many() {
        List<ClassContainsChar> classContainsChars = AutoCreate.build(ClassContainsChar.class)
                .with(x -> x.setObjectChar('A'))
                .with(x -> x.setObjectCharArray(new Character[]{'A', 'A', 'A'}))
                .with(x -> x.setObjectCharList(new ArrayList<Character>() {{
                    add('A');
                    add('A');
                    add('A');
                }}))
                .with(x -> x.setPrimitiveChar('A'))
                .with(x -> x.setPrimitiveCharArray(new char[]{'A', 'A', 'A'}))
                .createMany();

        for (ClassContainsChar classContainsChar : classContainsChars) {
            assertNotNull(classContainsChar);
            assertNotNull(classContainsChar.getObjectChar());
            assertNotNull(classContainsChar.getObjectCharArray());
            assertNotNull(classContainsChar.getPrimitiveCharArray());
            assertNotNull(classContainsChar.getObjectCharList());

            assertEquals(3, classContainsChar.getObjectCharArray().length);
            assertEquals(3, classContainsChar.getPrimitiveCharArray().length);
            assertEquals(3, classContainsChar.getObjectCharList().size());

            assertEquals('A', classContainsChar.getObjectChar());
            assertEquals('A', classContainsChar.getPrimitiveChar());
            for (int i = 0; i < 3; i++) {
                assertEquals('A', classContainsChar.getObjectCharArray()[i]);
                assertEquals('A', classContainsChar.getPrimitiveCharArray()[i]);
                assertEquals('A', classContainsChar.getObjectCharList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_double_using_create() {
        ClassContainsDouble classContainsDouble = AutoCreate.build(ClassContainsDouble.class).create();

        assertNotNull(classContainsDouble);
        assertNotNull(classContainsDouble.getObjectDouble());
        assertNotNull(classContainsDouble.getObjectDoubleArray());
        assertNotNull(classContainsDouble.getPrimitiveDoubleArray());
        assertNotNull(classContainsDouble.getObjectDoubleList());

        assertEquals(3, classContainsDouble.getObjectDoubleArray().length);
        assertEquals(3, classContainsDouble.getPrimitiveDoubleArray().length);
        assertEquals(3, classContainsDouble.getObjectDoubleList().size());

        assertTrue(classContainsDouble.getObjectDouble() >= 1.0);
        assertTrue(classContainsDouble.getObjectDouble() <= Double.MAX_VALUE);
        assertTrue(classContainsDouble.getPrimitiveDouble() >= 1.0);
        assertTrue(classContainsDouble.getPrimitiveDouble() <= Double.MAX_VALUE);
        for (int i = 0; i < 3; i++) {
            assertTrue(classContainsDouble.getObjectDoubleArray()[i] >= 1.0);
            assertTrue(classContainsDouble.getObjectDoubleArray()[i] <= Double.MAX_VALUE);
            assertTrue(classContainsDouble.getPrimitiveDoubleArray()[i] >= 1.0);
            assertTrue(classContainsDouble.getPrimitiveDoubleArray()[i] <= Double.MAX_VALUE);
            assertTrue(classContainsDouble.getObjectDoubleList().get(i) >= 1.0);
            assertTrue(classContainsDouble.getObjectDoubleList().get(i) <= Double.MAX_VALUE);
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_double_using_with_and_create() {
        ClassContainsDouble classContainsDouble = AutoCreate.build(ClassContainsDouble.class)
                .with(x -> x.setObjectDouble(1.0))
                .with(x -> x.setObjectDoubleArray(new Double[]{1.0, 1.0, 1.0}))
                .with(x -> x.setObjectDoubleList(new ArrayList<Double>() {{
                    add(1.0);
                    add(1.0);
                    add(1.0);
                }}))
                .with(x -> x.setPrimitiveDouble(1.0))
                .with(x -> x.setPrimitiveDoubleArray(new double[]{1.0, 1.0, 1.0}))
                .create();

        assertNotNull(classContainsDouble);
        assertNotNull(classContainsDouble.getObjectDouble());
        assertNotNull(classContainsDouble.getObjectDoubleArray());
        assertNotNull(classContainsDouble.getPrimitiveDoubleArray());
        assertNotNull(classContainsDouble.getObjectDoubleList());

        assertEquals(3, classContainsDouble.getObjectDoubleArray().length);
        assertEquals(3, classContainsDouble.getPrimitiveDoubleArray().length);
        assertEquals(3, classContainsDouble.getObjectDoubleList().size());

        assertEquals(1.0, classContainsDouble.getObjectDouble());
        assertEquals(1.0, classContainsDouble.getPrimitiveDouble());
        for (int i = 0; i < 3; i++) {
            assertEquals(1.0, classContainsDouble.getObjectDoubleArray()[i]);
            assertEquals(1.0, classContainsDouble.getPrimitiveDoubleArray()[i]);
            assertEquals(1.0, classContainsDouble.getObjectDoubleList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_double_using_create_many() {
        List<ClassContainsDouble> classContainsDoubles = AutoCreate.build(ClassContainsDouble.class).createMany();
        for (ClassContainsDouble classContainsDouble : classContainsDoubles) {
            assertNotNull(classContainsDouble);
            assertNotNull(classContainsDouble.getObjectDouble());
            assertNotNull(classContainsDouble.getObjectDoubleArray());
            assertNotNull(classContainsDouble.getPrimitiveDoubleArray());
            assertNotNull(classContainsDouble.getObjectDoubleList());

            assertEquals(3, classContainsDouble.getObjectDoubleArray().length);
            assertEquals(3, classContainsDouble.getPrimitiveDoubleArray().length);
            assertEquals(3, classContainsDouble.getObjectDoubleList().size());

            assertTrue(classContainsDouble.getObjectDouble() >= 1.0);
            assertTrue(classContainsDouble.getObjectDouble() <= Double.MAX_VALUE);
            assertTrue(classContainsDouble.getPrimitiveDouble() >= 1.0);
            assertTrue(classContainsDouble.getPrimitiveDouble() <= Double.MAX_VALUE);
            for (int i = 0; i < 3; i++) {
                assertTrue(classContainsDouble.getObjectDoubleArray()[i] >= 1.0);
                assertTrue(classContainsDouble.getObjectDoubleArray()[i] <= Double.MAX_VALUE);
                assertTrue(classContainsDouble.getPrimitiveDoubleArray()[i] >= 1.0);
                assertTrue(classContainsDouble.getPrimitiveDoubleArray()[i] <= Double.MAX_VALUE);
                assertTrue(classContainsDouble.getObjectDoubleList().get(i) >= 1.0);
                assertTrue(classContainsDouble.getObjectDoubleList().get(i) <= Double.MAX_VALUE);
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_double_using_with_and_create_many() {
        List<ClassContainsDouble> classContainsDoubles = AutoCreate.build(ClassContainsDouble.class)
                .with(x -> x.setObjectDouble(1.0))
                .with(x -> x.setObjectDoubleArray(new Double[]{1.0, 1.0, 1.0}))
                .with(x -> x.setObjectDoubleList(new ArrayList<Double>() {{
                    add(1.0);
                    add(1.0);
                    add(1.0);
                }}))
                .with(x -> x.setPrimitiveDouble(1.0))
                .with(x -> x.setPrimitiveDoubleArray(new double[]{1.0, 1.0, 1.0}))
                .createMany();

        for (ClassContainsDouble classContainsDouble : classContainsDoubles) {
            assertNotNull(classContainsDouble);
            assertNotNull(classContainsDouble.getObjectDouble());
            assertNotNull(classContainsDouble.getObjectDoubleArray());
            assertNotNull(classContainsDouble.getPrimitiveDoubleArray());
            assertNotNull(classContainsDouble.getObjectDoubleList());

            assertEquals(3, classContainsDouble.getObjectDoubleArray().length);
            assertEquals(3, classContainsDouble.getPrimitiveDoubleArray().length);
            assertEquals(3, classContainsDouble.getObjectDoubleList().size());

            assertEquals(1.0, classContainsDouble.getObjectDouble());
            assertEquals(1.0, classContainsDouble.getPrimitiveDouble());
            for (int i = 0; i < 3; i++) {
                assertEquals(1.0, classContainsDouble.getObjectDoubleArray()[i]);
                assertEquals(1.0, classContainsDouble.getPrimitiveDoubleArray()[i]);
                assertEquals(1.0, classContainsDouble.getObjectDoubleList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_float_using_create() {
        ClassContainsFloat classContainsFloat = AutoCreate.build(ClassContainsFloat.class).create();

        assertNotNull(classContainsFloat);
        assertNotNull(classContainsFloat.getObjectFloat());
        assertNotNull(classContainsFloat.getObjectFloatArray());
        assertNotNull(classContainsFloat.getPrimitiveFloatArray());
        assertNotNull(classContainsFloat.getObjectFloatList());

        assertEquals(3, classContainsFloat.getObjectFloatArray().length);
        assertEquals(3, classContainsFloat.getPrimitiveFloatArray().length);
        assertEquals(3, classContainsFloat.getObjectFloatList().size());

        assertTrue(classContainsFloat.getObjectFloat() >= 1.0);
        assertTrue(classContainsFloat.getObjectFloat() <= Float.MAX_VALUE);
        assertTrue(classContainsFloat.getPrimitiveFloat() >= 1.0);
        assertTrue(classContainsFloat.getPrimitiveFloat() <= Float.MAX_VALUE);
        for (int i = 0; i < 3; i++) {
            assertTrue(classContainsFloat.getObjectFloatArray()[i] >= 1.0);
            assertTrue(classContainsFloat.getObjectFloatArray()[i] <= Float.MAX_VALUE);
            assertTrue(classContainsFloat.getPrimitiveFloatArray()[i] >= 1.0);
            assertTrue(classContainsFloat.getPrimitiveFloatArray()[i] <= Float.MAX_VALUE);
            assertTrue(classContainsFloat.getObjectFloatList().get(i) >= 1.0);
            assertTrue(classContainsFloat.getObjectFloatList().get(i) <= Float.MAX_VALUE);
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_float_using_with_and_create() {
        ClassContainsFloat classContainsFloat = AutoCreate.build(ClassContainsFloat.class)
                .with(x -> x.setObjectFloat(1.0F))
                .with(x -> x.setObjectFloatArray(new Float[]{1.0F, 1.0F, 1.0F}))
                .with(x -> x.setObjectFloatList(new ArrayList<Float>() {{
                    add(1.0F);
                    add(1.0F);
                    add(1.0F);
                }}))
                .with(x -> x.setPrimitiveFloat(1.0F))
                .with(x -> x.setPrimitiveFloatArray(new float[]{1.0F, 1.0F, 1.0F}))
                .create();

        assertNotNull(classContainsFloat);
        assertNotNull(classContainsFloat.getObjectFloat());
        assertNotNull(classContainsFloat.getObjectFloatArray());
        assertNotNull(classContainsFloat.getPrimitiveFloatArray());
        assertNotNull(classContainsFloat.getObjectFloatList());

        assertEquals(3, classContainsFloat.getObjectFloatArray().length);
        assertEquals(3, classContainsFloat.getPrimitiveFloatArray().length);
        assertEquals(3, classContainsFloat.getObjectFloatList().size());

        assertEquals(1.0F, classContainsFloat.getObjectFloat());
        assertEquals(1.0F, classContainsFloat.getPrimitiveFloat());
        for (int i = 0; i < 3; i++) {
            assertEquals(1.0F, classContainsFloat.getObjectFloatArray()[i]);
            assertEquals(1.0F, classContainsFloat.getPrimitiveFloatArray()[i]);
            assertEquals(1.0F, classContainsFloat.getObjectFloatList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_float_using_create_many() {
        List<ClassContainsFloat> classContainsFloats = AutoCreate.build(ClassContainsFloat.class).createMany();
        for (ClassContainsFloat classContainsFloat : classContainsFloats) {
            assertNotNull(classContainsFloat);
            assertNotNull(classContainsFloat.getObjectFloat());
            assertNotNull(classContainsFloat.getObjectFloatArray());
            assertNotNull(classContainsFloat.getPrimitiveFloatArray());
            assertNotNull(classContainsFloat.getObjectFloatList());

            assertEquals(3, classContainsFloat.getObjectFloatArray().length);
            assertEquals(3, classContainsFloat.getPrimitiveFloatArray().length);
            assertEquals(3, classContainsFloat.getObjectFloatList().size());

            assertTrue(classContainsFloat.getObjectFloat() >= 1.0);
            assertTrue(classContainsFloat.getObjectFloat() <= Float.MAX_VALUE);
            assertTrue(classContainsFloat.getPrimitiveFloat() >= 1.0);
            assertTrue(classContainsFloat.getPrimitiveFloat() <= Float.MAX_VALUE);
            for (int i = 0; i < 3; i++) {
                assertTrue(classContainsFloat.getObjectFloatArray()[i] >= 1.0);
                assertTrue(classContainsFloat.getObjectFloatArray()[i] <= Float.MAX_VALUE);
                assertTrue(classContainsFloat.getPrimitiveFloatArray()[i] >= 1.0);
                assertTrue(classContainsFloat.getPrimitiveFloatArray()[i] <= Float.MAX_VALUE);
                assertTrue(classContainsFloat.getObjectFloatList().get(i) >= 1.0);
                assertTrue(classContainsFloat.getObjectFloatList().get(i) <= Float.MAX_VALUE);
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_float_using_with_and_create_many() {
        List<ClassContainsFloat> classContainsFloats = AutoCreate.build(ClassContainsFloat.class)
                .with(x -> x.setObjectFloat(1.0F))
                .with(x -> x.setObjectFloatArray(new Float[]{1.0F, 1.0F, 1.0F}))
                .with(x -> x.setObjectFloatList(new ArrayList<Float>() {{
                    add(1.0F);
                    add(1.0F);
                    add(1.0F);
                }}))
                .with(x -> x.setPrimitiveFloat(1.0F))
                .with(x -> x.setPrimitiveFloatArray(new float[]{1.0F, 1.0F, 1.0F}))
                .createMany();

        for (ClassContainsFloat classContainsFloat : classContainsFloats) {
            assertNotNull(classContainsFloat);
            assertNotNull(classContainsFloat.getObjectFloat());
            assertNotNull(classContainsFloat.getObjectFloatArray());
            assertNotNull(classContainsFloat.getPrimitiveFloatArray());
            assertNotNull(classContainsFloat.getObjectFloatList());

            assertEquals(3, classContainsFloat.getObjectFloatArray().length);
            assertEquals(3, classContainsFloat.getPrimitiveFloatArray().length);
            assertEquals(3, classContainsFloat.getObjectFloatList().size());

            assertEquals(1.0F, classContainsFloat.getObjectFloat());
            assertEquals(1.0F, classContainsFloat.getPrimitiveFloat());
            for (int i = 0; i < 3; i++) {
                assertEquals(1.0F, classContainsFloat.getObjectFloatArray()[i]);
                assertEquals(1.0F, classContainsFloat.getPrimitiveFloatArray()[i]);
                assertEquals(1.0F, classContainsFloat.getObjectFloatList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_integer_using_create() {
        ClassContainsInteger classContainsInteger = AutoCreate.build(ClassContainsInteger.class).create();

        assertNotNull(classContainsInteger);
        assertNotNull(classContainsInteger.getObjectInteger());
        assertNotNull(classContainsInteger.getObjectIntegerArray());
        assertNotNull(classContainsInteger.getPrimitiveIntegerArray());
        assertNotNull(classContainsInteger.getObjectIntegerList());

        assertEquals(3, classContainsInteger.getObjectIntegerArray().length);
        assertEquals(3, classContainsInteger.getPrimitiveIntegerArray().length);
        assertEquals(3, classContainsInteger.getObjectIntegerList().size());

        assertTrue(classContainsInteger.getObjectInteger() >= 1);
        assertTrue(classContainsInteger.getPrimitiveInteger() >= 1);
        for (int i = 0; i < 3; i++) {
            assertTrue(classContainsInteger.getObjectIntegerArray()[i] >= 1);
            assertTrue(classContainsInteger.getPrimitiveIntegerArray()[i] >= 1);
            assertTrue(classContainsInteger.getObjectIntegerList().get(i) >= 1);
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_integer_using_with_and_create() {
        ClassContainsInteger classContainsInteger = AutoCreate.build(ClassContainsInteger.class)
                .with(x -> x.setObjectInteger(1))
                .with(x -> x.setObjectIntegerArray(new Integer[]{1, 1, 1}))
                .with(x -> x.setObjectIntegerList(new ArrayList<Integer>() {{
                    add(1);
                    add(1);
                    add(1);
                }}))
                .with(x -> x.setPrimitiveInteger(1))
                .with(x -> x.setPrimitiveIntegerArray(new int[]{1, 1, 1}))
                .create();

        assertNotNull(classContainsInteger);
        assertNotNull(classContainsInteger.getObjectInteger());
        assertNotNull(classContainsInteger.getObjectIntegerArray());
        assertNotNull(classContainsInteger.getPrimitiveIntegerArray());
        assertNotNull(classContainsInteger.getObjectIntegerList());

        assertEquals(3, classContainsInteger.getObjectIntegerArray().length);
        assertEquals(3, classContainsInteger.getPrimitiveIntegerArray().length);
        assertEquals(3, classContainsInteger.getObjectIntegerList().size());

        assertEquals(1, classContainsInteger.getObjectInteger());
        assertEquals(1, classContainsInteger.getPrimitiveInteger());
        for (int i = 0; i < 3; i++) {
            assertEquals(1, classContainsInteger.getObjectIntegerArray()[i]);
            assertEquals(1, classContainsInteger.getPrimitiveIntegerArray()[i]);
            assertEquals(1, classContainsInteger.getObjectIntegerList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_integer_using_create_many() {
        List<ClassContainsInteger> classContainsIntegers = AutoCreate.build(ClassContainsInteger.class).createMany();
        for (ClassContainsInteger classContainsInteger : classContainsIntegers) {
            assertNotNull(classContainsInteger);
            assertNotNull(classContainsInteger.getObjectInteger());
            assertNotNull(classContainsInteger.getObjectIntegerArray());
            assertNotNull(classContainsInteger.getPrimitiveIntegerArray());
            assertNotNull(classContainsInteger.getObjectIntegerList());

            assertEquals(3, classContainsInteger.getObjectIntegerArray().length);
            assertEquals(3, classContainsInteger.getPrimitiveIntegerArray().length);
            assertEquals(3, classContainsInteger.getObjectIntegerList().size());

            assertTrue(classContainsInteger.getObjectInteger() >= 1);
            assertTrue(classContainsInteger.getPrimitiveInteger() >= 1);
            for (int i = 0; i < 3; i++) {
                assertTrue(classContainsInteger.getObjectIntegerArray()[i] >= 1);
                assertTrue(classContainsInteger.getPrimitiveIntegerArray()[i] >= 1);
                assertTrue(classContainsInteger.getObjectIntegerList().get(i) >= 1);
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_integer_using_with_and_create_many() {
        List<ClassContainsInteger> classContainsIntegers = AutoCreate.build(ClassContainsInteger.class)
                .with(x -> x.setObjectInteger(1))
                .with(x -> x.setObjectIntegerArray(new Integer[]{1, 1, 1}))
                .with(x -> x.setObjectIntegerList(new ArrayList<Integer>() {{
                    add(1);
                    add(1);
                    add(1);
                }}))
                .with(x -> x.setPrimitiveInteger(1))
                .with(x -> x.setPrimitiveIntegerArray(new int[]{1, 1, 1}))
                .createMany();

        for (ClassContainsInteger classContainsInteger : classContainsIntegers) {
            assertNotNull(classContainsInteger);
            assertNotNull(classContainsInteger.getObjectInteger());
            assertNotNull(classContainsInteger.getObjectIntegerArray());
            assertNotNull(classContainsInteger.getPrimitiveIntegerArray());
            assertNotNull(classContainsInteger.getObjectIntegerList());

            assertEquals(3, classContainsInteger.getObjectIntegerArray().length);
            assertEquals(3, classContainsInteger.getPrimitiveIntegerArray().length);
            assertEquals(3, classContainsInteger.getObjectIntegerList().size());

            assertEquals(1, classContainsInteger.getObjectInteger());
            assertEquals(1, classContainsInteger.getPrimitiveInteger());
            for (int i = 0; i < 3; i++) {
                assertEquals(1, classContainsInteger.getObjectIntegerArray()[i]);
                assertEquals(1, classContainsInteger.getPrimitiveIntegerArray()[i]);
                assertEquals(1, classContainsInteger.getObjectIntegerList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_long_using_create() {
        ClassContainsLong classContainsLong = AutoCreate.build(ClassContainsLong.class).create();

        assertNotNull(classContainsLong);
        assertNotNull(classContainsLong.getObjectLong());
        assertNotNull(classContainsLong.getObjectLongArray());
        assertNotNull(classContainsLong.getPrimitiveLongArray());
        assertNotNull(classContainsLong.getObjectLongList());

        assertEquals(3, classContainsLong.getObjectLongArray().length);
        assertEquals(3, classContainsLong.getPrimitiveLongArray().length);
        assertEquals(3, classContainsLong.getObjectLongList().size());

        assertTrue(classContainsLong.getObjectLong() >= 1);
        assertTrue(classContainsLong.getPrimitiveLong() >= 1);
        for (int i = 0; i < 3; i++) {
            assertTrue(classContainsLong.getObjectLongArray()[i] >= 1);
            assertTrue(classContainsLong.getPrimitiveLongArray()[i] >= 1);
            assertTrue(classContainsLong.getObjectLongList().get(i) >= 1);
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_long_using_with_and_create() {
        ClassContainsLong classContainsLong = AutoCreate.build(ClassContainsLong.class)
                .with(x -> x.setObjectLong(1L))
                .with(x -> x.setObjectLongArray(new Long[]{1L, 1L, 1L}))
                .with(x -> x.setObjectLongList(new ArrayList<Long>() {{
                    add(1L);
                    add(1L);
                    add(1L);
                }}))
                .with(x -> x.setPrimitiveLong(1L))
                .with(x -> x.setPrimitiveLongArray(new long[]{1L, 1L, 1L}))
                .create();

        assertNotNull(classContainsLong);
        assertNotNull(classContainsLong.getObjectLong());
        assertNotNull(classContainsLong.getObjectLongArray());
        assertNotNull(classContainsLong.getPrimitiveLongArray());
        assertNotNull(classContainsLong.getObjectLongList());

        assertEquals(3, classContainsLong.getObjectLongArray().length);
        assertEquals(3, classContainsLong.getPrimitiveLongArray().length);
        assertEquals(3, classContainsLong.getObjectLongList().size());

        assertEquals(1L, classContainsLong.getObjectLong());
        assertEquals(1L, classContainsLong.getPrimitiveLong());
        for (int i = 0; i < 3; i++) {
            assertEquals(1L, classContainsLong.getObjectLongArray()[i]);
            assertEquals(1L, classContainsLong.getPrimitiveLongArray()[i]);
            assertEquals(1L, classContainsLong.getObjectLongList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_long_using_create_many() {
        List<ClassContainsLong> classContainsLongs = AutoCreate.build(ClassContainsLong.class).createMany();
        for (ClassContainsLong classContainsLong : classContainsLongs) {
            assertNotNull(classContainsLong);
            assertNotNull(classContainsLong.getObjectLong());
            assertNotNull(classContainsLong.getObjectLongArray());
            assertNotNull(classContainsLong.getPrimitiveLongArray());
            assertNotNull(classContainsLong.getObjectLongList());

            assertEquals(3, classContainsLong.getObjectLongArray().length);
            assertEquals(3, classContainsLong.getPrimitiveLongArray().length);
            assertEquals(3, classContainsLong.getObjectLongList().size());

            assertTrue(classContainsLong.getObjectLong() >= 1);
            assertTrue(classContainsLong.getPrimitiveLong() >= 1);
            for (int i = 0; i < 3; i++) {
                assertTrue(classContainsLong.getObjectLongArray()[i] >= 1);
                assertTrue(classContainsLong.getPrimitiveLongArray()[i] >= 1);
                assertTrue(classContainsLong.getObjectLongList().get(i) >= 1);
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_long_using_with_and_create_many() {
        List<ClassContainsLong> classContainsLongs = AutoCreate.build(ClassContainsLong.class)
                .with(x -> x.setObjectLong(1L))
                .with(x -> x.setObjectLongArray(new Long[]{1L, 1L, 1L}))
                .with(x -> x.setObjectLongList(new ArrayList<Long>() {{
                    add(1L);
                    add(1L);
                    add(1L);
                }}))
                .with(x -> x.setPrimitiveLong(1L))
                .with(x -> x.setPrimitiveLongArray(new long[]{1L, 1L, 1L}))
                .createMany();

        for (ClassContainsLong classContainsLong : classContainsLongs) {
            assertNotNull(classContainsLong);
            assertNotNull(classContainsLong.getObjectLong());
            assertNotNull(classContainsLong.getObjectLongArray());
            assertNotNull(classContainsLong.getPrimitiveLongArray());
            assertNotNull(classContainsLong.getObjectLongList());

            assertEquals(3, classContainsLong.getObjectLongArray().length);
            assertEquals(3, classContainsLong.getPrimitiveLongArray().length);
            assertEquals(3, classContainsLong.getObjectLongList().size());

            assertEquals(1L, classContainsLong.getObjectLong());
            assertEquals(1L, classContainsLong.getPrimitiveLong());
            for (int i = 0; i < 3; i++) {
                assertEquals(1L, classContainsLong.getObjectLongArray()[i]);
                assertEquals(1L, classContainsLong.getPrimitiveLongArray()[i]);
                assertEquals(1L, classContainsLong.getObjectLongList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_short_using_create() {
        ClassContainsShort classContainsShort = AutoCreate.build(ClassContainsShort.class).create();

        assertNotNull(classContainsShort);
        assertNotNull(classContainsShort.getObjectShort());
        assertNotNull(classContainsShort.getObjectShortArray());
        assertNotNull(classContainsShort.getPrimitiveShortArray());
        assertNotNull(classContainsShort.getObjectShortList());

        assertEquals(3, classContainsShort.getObjectShortArray().length);
        assertEquals(3, classContainsShort.getPrimitiveShortArray().length);
        assertEquals(3, classContainsShort.getObjectShortList().size());

        assertTrue(classContainsShort.getObjectShort() >= 1);
        assertTrue(classContainsShort.getPrimitiveShort() >= 1);
        for (int i = 0; i < 3; i++) {
            assertTrue(classContainsShort.getObjectShortArray()[i] >= 1);
            assertTrue(classContainsShort.getPrimitiveShortArray()[i] >= 1);
            assertTrue(classContainsShort.getObjectShortList().get(i) >= 1);
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_short_using_with_and_create() {
        ClassContainsShort classContainsShort = AutoCreate.build(ClassContainsShort.class)
                .with(x -> x.setObjectShort((short) 1))
                .with(x -> x.setObjectShortArray(new Short[]{(short) 1, (short) 1, (short) 1}))
                .with(x -> x.setObjectShortList(new ArrayList<Short>() {{
                    add((short) 1);
                    add((short) 1);
                    add((short) 1);
                }}))
                .with(x -> x.setPrimitiveShort((short) 1))
                .with(x -> x.setPrimitiveShortArray(new short[]{(short) 1, (short) 1, (short) 1}))
                .create();

        assertNotNull(classContainsShort);
        assertNotNull(classContainsShort.getObjectShort());
        assertNotNull(classContainsShort.getObjectShortArray());
        assertNotNull(classContainsShort.getPrimitiveShortArray());
        assertNotNull(classContainsShort.getObjectShortList());

        assertEquals(3, classContainsShort.getObjectShortArray().length);
        assertEquals(3, classContainsShort.getPrimitiveShortArray().length);
        assertEquals(3, classContainsShort.getObjectShortList().size());

        assertEquals((short) 1, classContainsShort.getObjectShort());
        assertEquals((short) 1, classContainsShort.getPrimitiveShort());
        for (int i = 0; i < 3; i++) {
            assertEquals((short) 1, classContainsShort.getObjectShortArray()[i]);
            assertEquals((short) 1, classContainsShort.getPrimitiveShortArray()[i]);
            assertEquals((short) 1, classContainsShort.getObjectShortList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_short_using_create_many() {
        List<ClassContainsShort> classContainsShorts = AutoCreate.build(ClassContainsShort.class).createMany();
        for (ClassContainsShort classContainsShort : classContainsShorts) {
            assertNotNull(classContainsShort);
            assertNotNull(classContainsShort.getObjectShort());
            assertNotNull(classContainsShort.getObjectShortArray());
            assertNotNull(classContainsShort.getPrimitiveShortArray());
            assertNotNull(classContainsShort.getObjectShortList());

            assertEquals(3, classContainsShort.getObjectShortArray().length);
            assertEquals(3, classContainsShort.getPrimitiveShortArray().length);
            assertEquals(3, classContainsShort.getObjectShortList().size());

            assertTrue(classContainsShort.getObjectShort() >= 1);
            assertTrue(classContainsShort.getPrimitiveShort() >= 1);
            for (int i = 0; i < 3; i++) {
                assertTrue(classContainsShort.getObjectShortArray()[i] >= 1);
                assertTrue(classContainsShort.getPrimitiveShortArray()[i] >= 1);
                assertTrue(classContainsShort.getObjectShortList().get(i) >= 1);
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_short_using_with_and_create_many() {
        List<ClassContainsShort> classContainsShorts = AutoCreate.build(ClassContainsShort.class)
                .with(x -> x.setObjectShort((short) 1))
                .with(x -> x.setObjectShortArray(new Short[]{(short) 1, (short) 1, (short) 1}))
                .with(x -> x.setObjectShortList(new ArrayList<Short>() {{
                    add((short) 1);
                    add((short) 1);
                    add((short) 1);
                }}))
                .with(x -> x.setPrimitiveShort((short) 1))
                .with(x -> x.setPrimitiveShortArray(new short[]{(short) 1, (short) 1, (short) 1}))
                .createMany();

        for (ClassContainsShort classContainsShort : classContainsShorts) {
            assertNotNull(classContainsShort);
            assertNotNull(classContainsShort.getObjectShort());
            assertNotNull(classContainsShort.getObjectShortArray());
            assertNotNull(classContainsShort.getPrimitiveShortArray());
            assertNotNull(classContainsShort.getObjectShortList());

            assertEquals(3, classContainsShort.getObjectShortArray().length);
            assertEquals(3, classContainsShort.getPrimitiveShortArray().length);
            assertEquals(3, classContainsShort.getObjectShortList().size());

            assertEquals((short) 1, classContainsShort.getObjectShort());
            assertEquals((short) 1, classContainsShort.getPrimitiveShort());
            for (int i = 0; i < 3; i++) {
                assertEquals((short) 1, classContainsShort.getObjectShortArray()[i]);
                assertEquals((short) 1, classContainsShort.getPrimitiveShortArray()[i]);
                assertEquals((short) 1, classContainsShort.getObjectShortList().get(i));
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_string_using_create() {
        ClassContainsString classContainsString = AutoCreate.build(ClassContainsString.class).create();

        assertNotNull(classContainsString);
        assertNotNull(classContainsString.getObjectString());
        assertNotNull(classContainsString.getObjectStringArray());
        assertNotNull(classContainsString.getObjectStringList());

        assertEquals(3, classContainsString.getObjectStringArray().length);
        assertEquals(3, classContainsString.getObjectStringList().size());

        assertNotEquals("", classContainsString.getObjectString().trim());
        for (int i = 0; i < 3; i++) {
            assertNotEquals("", classContainsString.getObjectStringArray()[i].trim());
            assertNotEquals("", classContainsString.getObjectStringList().get(i).trim());
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_string_using_with_and_create() {
        ClassContainsString classContainsString = AutoCreate.build(ClassContainsString.class)
                .with(x -> x.setObjectString("test"))
                .with(x -> x.setObjectStringArray(new String[]{"test", "test", "test"}))
                .with(x -> x.setObjectStringList(new ArrayList<String>() {{
                    add("test");
                    add("test");
                    add("test");
                }}))
                .create();

        assertNotNull(classContainsString);
        assertNotNull(classContainsString.getObjectString());
        assertNotNull(classContainsString.getObjectStringArray());
        assertNotNull(classContainsString.getObjectStringList());

        assertEquals(3, classContainsString.getObjectStringArray().length);
        assertEquals(3, classContainsString.getObjectStringList().size());

        assertEquals("test", classContainsString.getObjectString().trim());
        for (int i = 0; i < 3; i++) {
            assertEquals("test", classContainsString.getObjectStringArray()[i].trim());
            assertEquals("test", classContainsString.getObjectStringList().get(i).trim());
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_string_using_create_many() {
        List<ClassContainsString> classContainsStrings = AutoCreate.build(ClassContainsString.class).createMany();
        for (ClassContainsString classContainsString : classContainsStrings) {
            assertNotNull(classContainsString);
            assertNotNull(classContainsString.getObjectString());
            assertNotNull(classContainsString.getObjectStringArray());
            assertNotNull(classContainsString.getObjectStringList());

            assertEquals(3, classContainsString.getObjectStringArray().length);
            assertEquals(3, classContainsString.getObjectStringList().size());

            assertNotEquals("", classContainsString.getObjectString().trim());
            for (int i = 0; i < 3; i++) {
                assertNotEquals("", classContainsString.getObjectStringArray()[i].trim());
                assertNotEquals("", classContainsString.getObjectStringList().get(i).trim());
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_string_using_with_and_create_many() {
        List<ClassContainsString> classContainsStrings = AutoCreate.build(ClassContainsString.class)
                .with(x -> x.setObjectString("test"))
                .with(x -> x.setObjectStringArray(new String[]{"test", "test", "test"}))
                .with(x -> x.setObjectStringList(new ArrayList<String>() {{
                    add("test");
                    add("test");
                    add("test");
                }}))
                .createMany();

        for (ClassContainsString classContainsString : classContainsStrings) {
            assertNotNull(classContainsString);
            assertNotNull(classContainsString.getObjectString());
            assertNotNull(classContainsString.getObjectStringArray());
            assertNotNull(classContainsString.getObjectStringList());

            assertEquals(3, classContainsString.getObjectStringArray().length);
            assertEquals(3, classContainsString.getObjectStringList().size());

            assertEquals("test", classContainsString.getObjectString().trim());
            for (int i = 0; i < 3; i++) {
                assertEquals("test", classContainsString.getObjectStringArray()[i].trim());
                assertEquals("test", classContainsString.getObjectStringList().get(i).trim());
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_object_using_create() {
        ClassContainsObject classContainsObject = AutoCreate.build(ClassContainsObject.class).create();

        assertNotNull(classContainsObject);
        assertNotNull(classContainsObject.getTestObject());
        assertNotNull(classContainsObject.getTestObjectArray());
        assertNotNull(classContainsObject.getTestObjectList());

        assertNotNull(classContainsObject.getTestObject().getString());
        for (int i = 0; i < 3; i++) {
            assertNotNull(classContainsObject.getTestObjectArray()[i].getString());
            assertNotNull(classContainsObject.getTestObjectList().get(i).getString());
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_object_using_with_and_create() {
        TestObject testObject = new TestObject();
        testObject.setString("test");
        ClassContainsObject classContainsObject = AutoCreate.build(ClassContainsObject.class)
                .with(x -> x.setTestObject(testObject))
                .with(x -> x.setTestObjectArray(new TestObject[]{testObject, testObject, testObject}))
                .with(x -> x.setTestObjectList(new ArrayList<TestObject>() {{
                    add(testObject);
                    add(testObject);
                    add(testObject);
                }}))
                .create();

        assertNotNull(classContainsObject);
        assertNotNull(classContainsObject.getTestObject());
        assertNotNull(classContainsObject.getTestObjectArray());
        assertNotNull(classContainsObject.getTestObjectList());

        assertNotNull(classContainsObject.getTestObject().getString());
        assertEquals("test", classContainsObject.getTestObject().getString());
        for (int i = 0; i < 3; i++) {
            assertNotNull(classContainsObject.getTestObjectArray()[i].getString());
            assertEquals("test", classContainsObject.getTestObjectArray()[i].getString());
            assertNotNull(classContainsObject.getTestObjectList().get(i).getString());
            assertEquals("test", classContainsObject.getTestObjectList().get(i).getString());
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_object_using_create_many() {
        List<ClassContainsObject> classContainsObjects = AutoCreate.build(ClassContainsObject.class).createMany();
        for (ClassContainsObject classContainsObject : classContainsObjects) {
            assertNotNull(classContainsObject);
            assertNotNull(classContainsObject.getTestObject());
            assertNotNull(classContainsObject.getTestObjectArray());
            assertNotNull(classContainsObject.getTestObjectList());

            assertNotNull(classContainsObject.getTestObject().getString());
            for (int i = 0; i < 3; i++) {
                assertNotNull(classContainsObject.getTestObjectArray()[i].getString());
                assertNotNull(classContainsObject.getTestObjectList().get(i).getString());
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_object_using_with_and_create_many() {
        TestObject testObject = new TestObject();
        testObject.setString("test");
        List<ClassContainsObject> classContainsObjects = AutoCreate.build(ClassContainsObject.class)
                .with(x -> x.setTestObject(testObject))
                .with(x -> x.setTestObjectArray(new TestObject[]{testObject, testObject, testObject}))
                .with(x -> x.setTestObjectList(new ArrayList<TestObject>() {{
                    add(testObject);
                    add(testObject);
                    add(testObject);
                }}))
                .createMany();

        for (ClassContainsObject classContainsObject : classContainsObjects) {
            assertNotNull(classContainsObject);
            assertNotNull(classContainsObject.getTestObject());
            assertNotNull(classContainsObject.getTestObjectArray());
            assertNotNull(classContainsObject.getTestObjectList());

            assertNotNull(classContainsObject.getTestObject().getString());
            assertEquals("test", classContainsObject.getTestObject().getString());
            for (int i = 0; i < 3; i++) {
                assertNotNull(classContainsObject.getTestObjectArray()[i].getString());
                assertEquals("test", classContainsObject.getTestObjectArray()[i].getString());
                assertNotNull(classContainsObject.getTestObjectList().get(i).getString());
                assertEquals("test", classContainsObject.getTestObjectList().get(i).getString());
            }
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_extended_object_using_create() {
        ClassContainsExtendedClass classContainsExtendedClass = AutoCreate.build(ClassContainsExtendedClass.class).create();

        assertNotNull(classContainsExtendedClass);
        assertNotNull(classContainsExtendedClass.getNewString());
        assertNotNull(classContainsExtendedClass.getString());
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_extended_object_using_with_and_create() {
        ClassContainsExtendedClass classContainsExtendedClass = AutoCreate.build(ClassContainsExtendedClass.class)
                .with(x -> x.setString("test"))
                .with(x -> x.setNewString("test"))
                .create();

        assertNotNull(classContainsExtendedClass);
        assertNotNull(classContainsExtendedClass.getNewString());
        assertNotNull(classContainsExtendedClass.getString());

        assertEquals("test", classContainsExtendedClass.getString());
        assertEquals("test", classContainsExtendedClass.getNewString());
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_extended_object_using_create_many() {
        List<ClassContainsExtendedClass> classContainsExtendedClasses = AutoCreate.build(ClassContainsExtendedClass.class).createMany();

        assertNotNull(classContainsExtendedClasses);
        assertEquals(3, classContainsExtendedClasses.size());
        for (ClassContainsExtendedClass classContainsExtendedClass : classContainsExtendedClasses) {
            assertNotNull(classContainsExtendedClass.getNewString());
            assertNotNull(classContainsExtendedClass.getString());
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_extended_object_using_with_and_create_many() {
        List<ClassContainsExtendedClass> classContainsExtendedClasses = AutoCreate.build(ClassContainsExtendedClass.class)
                .with(x -> x.setString("test"))
                .with(x -> x.setNewString("test"))
                .createMany();

        for (ClassContainsExtendedClass classContainsExtendedClass : classContainsExtendedClasses) {
            assertNotNull(classContainsExtendedClass);
            assertNotNull(classContainsExtendedClass.getNewString());
            assertNotNull(classContainsExtendedClass.getString());

            assertEquals("test", classContainsExtendedClass.getString());
            assertEquals("test", classContainsExtendedClass.getNewString());
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_date_using_create() {
        ClassContainsDate classContainsDate = AutoCreate.build(ClassContainsDate.class).create();

        assertNotNull(classContainsDate);
        assertNotNull(classContainsDate.getObjectDate());
        assertNotNull(classContainsDate.getObjectDateArray());
        assertNotNull(classContainsDate.getObjectDateList());

        assertEquals(3, classContainsDate.getObjectDateArray().length);
        assertEquals(3, classContainsDate.getObjectDateList().size());
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_date_using_with_and_create() {
        var dateNow = new Date();
        ClassContainsDate classContainsDate = AutoCreate.build(ClassContainsDate.class)
                .with(x -> x.setObjectDate(dateNow))
                .with(x -> x.setObjectDateArray(new Date[]{dateNow, dateNow, dateNow}))
                .with(x -> x.setObjectDateList(new ArrayList<Date>() {{
                    add(dateNow);
                    add(dateNow);
                    add(dateNow);
                }}))
                .create();

        assertNotNull(classContainsDate);
        assertNotNull(classContainsDate.getObjectDate());
        assertNotNull(classContainsDate.getObjectDateArray());
        assertNotNull(classContainsDate.getObjectDateList());

        assertEquals(3, classContainsDate.getObjectDateArray().length);
        assertEquals(3, classContainsDate.getObjectDateList().size());

        assertEquals(dateNow, classContainsDate.getObjectDate());
        for (int i = 0; i < 3; i++) {
            assertEquals(dateNow, classContainsDate.getObjectDateArray()[i]);
            assertEquals(dateNow, classContainsDate.getObjectDateList().get(i));
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_date_using_create_many() {
        List<ClassContainsDate> classContainsDates = AutoCreate.build(ClassContainsDate.class).createMany();
        for (ClassContainsDate classContainsDate : classContainsDates) {
            assertNotNull(classContainsDate);
            assertNotNull(classContainsDate.getObjectDate());
            assertNotNull(classContainsDate.getObjectDateArray());
            assertNotNull(classContainsDate.getObjectDateList());

            assertEquals(3, classContainsDate.getObjectDateArray().length);
            assertEquals(3, classContainsDate.getObjectDateList().size());
        }
    }

    @Test
    @Benchmark
    @OutputTimeUnit(TimeUnit.MILLISECONDS)
    public void it_should_create_object_with_date_using_with_and_create_many() {
        var dateNow = new Date();
        List<ClassContainsDate> classContainsDates = AutoCreate.build(ClassContainsDate.class)
                .with(x -> x.setObjectDate(dateNow))
                .with(x -> x.setObjectDateArray(new Date[]{dateNow, dateNow, dateNow}))
                .with(x -> x.setObjectDateList(new ArrayList<Date>() {{
                    add(dateNow);
                    add(dateNow);
                    add(dateNow);
                }}))
                .createMany();

        for (ClassContainsDate classContainsDate : classContainsDates) {
            assertNotNull(classContainsDate);
            assertNotNull(classContainsDate.getObjectDate());
            assertNotNull(classContainsDate.getObjectDateArray());
            assertNotNull(classContainsDate.getObjectDateList());

            assertEquals(3, classContainsDate.getObjectDateArray().length);
            assertEquals(3, classContainsDate.getObjectDateList().size());
        }
    }
}
