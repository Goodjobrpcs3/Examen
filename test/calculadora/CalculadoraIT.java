/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculadora;

import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Nick B-Metelytsya
 */
@RunWith(Parameterized.class)
public class CalculadoraIT 
{
private Calculadora calc;
private int expected;
private int a;
private int b;

@Parameters
public static Collection<Object[]> numeros()
{
return Arrays.asList(new Object [][]{{2,2,0},{5,4,2},{10,5,5}});
}

public CalculadoraIT(int a, int b, int expected) 
{
this.a=a;
this.b=b;
this.expected=expected;

}
@Before
public void crearCalculadora()
{
calc=new Calculadora(a,b);
}

@Test
public void testResta()
{
assertEquals(expected,calc.resta());
}

@After
public void borrarCalculadora()
{
calc=null;
}
}
