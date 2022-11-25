package task1.document.documentVisitors;

import task1.document.textSegments.DocumentVisitor;

/**
 * Represents a text segment of a document that needs to be parsed.
 */
public abstract class TextSegment {
    private String content;

    TextSegment(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    // TODO add method for applying the visitor
    public abstract StringBuilder accept(DocumentVisitor visitor);
}
