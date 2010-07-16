/*
 * File: XHTMLHelper.java
 * Project: Threepio
 * Author: Jeff Houle
 */
package threepio.helper;

/**
 * XHTMLHelper provides some methods for use in XML and HTML handling.
 * @author jhoule
 */
public class XHTMLHelper
{
    /**
     * returns a string that opens an XML/HTML tag of type type
     * @param type - the stuff to put inside the tag.
     * @return the open tag string
     */
    public static String openTag(String type)
    {
        return ("<" + type + ">");
    }

    /**
     * returns a string that closes an XML/HTML tag of type type
     * @param type - the stuff to put inside the tag.
     * @return the end tag string
     */
    public static String closeTag(String type)
    {
        return openTag("/" + type);
    }

    /**
     * returns an XML/HTML element with type type and contents b
     * @param type - the type for the element
     * @param b - the contents of the element
     * @return a string representing the object.
     */
    public static String makeBasicElement(String type, String b)
    {
        return (openTag(type) + b + closeTag(type));
    }

    /**
     * returns a span element with contents b
     * @param b - the contents of the span.
     * @return the span string
     */
    public static String makeSpan(String b)
    {
        return makeBasicElement("span", b);
    }

    /**
     * returns a string that contains the amount of "tabs" specified.
     * @param tabs - the amount of tabs to return
     * @return a string of tabs.
     */
    public static String tabber(int tabs)
    {
        StringBuffer buff = new StringBuffer();

        for (int i = 0; i < tabs; i++)
        {
            buff.append("\t");
        }

        return buff.toString();
    }
}