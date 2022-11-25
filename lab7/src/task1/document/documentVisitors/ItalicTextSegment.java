package task1.document.documentVisitors;

import task1.document.textSegments.DocumentVisitor;

public class ItalicTextSegment extends TextSegment{
    ItalicTextSegment(String content) {
        super(content);
    }

    @Override
    void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
