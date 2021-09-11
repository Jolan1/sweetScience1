package com.bnta4.sweetscience.delete;

import com.bnta4.sweetscience.boxerStyle.BoxerStyle;
import com.bnta4.sweetscience.boxerStyle.Elements;

import java.util.Objects;

public class RealBoxer {
    private String name;
    private BoxerStyle boxerStyle;
    private Elements elements;

    public RealBoxer(String name, BoxerStyle boxerStyle, Elements elements) {
        this.name = name;
        this.boxerStyle = boxerStyle;
        this.elements = elements;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BoxerStyle getBoxerStyle() {
        return boxerStyle;
    }

    public void setBoxerStyle(BoxerStyle boxerStyle) {
        this.boxerStyle = boxerStyle;
    }

    public Elements getElements() {
        return elements;
    }

    public void setElements(Elements elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "RealBoxer{" +
                "name='" + name + '\'' +
                ", boxerStyle=" + boxerStyle +
                ", elements=" + elements +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RealBoxer)) return false;
        RealBoxer realBoxer = (RealBoxer) o;
        return getName().equals(realBoxer.getName()) && getBoxerStyle() == realBoxer.getBoxerStyle() && getElements() == realBoxer.getElements();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getBoxerStyle(), getElements());
    }
}
