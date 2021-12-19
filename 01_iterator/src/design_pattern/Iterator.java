package design_pattern;

/**
 * 数え上げ、スキャンを行うインタフェース
 * 
 * @author hryk
 */
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
