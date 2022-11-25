package task1.document.documentVisitors;

import task1.document.textSegments.DocumentVisitor;

public class ItalicTextSegment extends TextSegment{
    public ItalicTextSegment(String content) {
        super(content);
    }

    @Override
    public StringBuilder accept(DocumentVisitor visitor) {
        return visitor.visit(this);
    }
}
