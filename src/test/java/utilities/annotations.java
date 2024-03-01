package utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import Iretry.MyRetry;

public class annotations implements IAnnotationTransformer {
 public void transform(ITestAnnotation annotations,Class testClass,Constructor testConstructor,Method testMethod) {
	 annotations.setRetryAnalyzer(MyRetry.class);
 }
}
