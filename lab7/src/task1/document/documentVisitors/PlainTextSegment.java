package task1.document.documentVisitors;

import task1.document.textSegments.DocumentVisitor;

public class PlainTextSegment extends TextSegment {
    public PlainTextSegment(String content) {
        super(content);
    }

    @Override
    public StringBuilder accept(DocumentVisitor visitor) {
        return visitor.visit(this);
    }
}
