/*
 * Copyright (c) 2005, Pete Bevin.
 * <http://markdownj.petebevin.com>
 *
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *  - Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 *  - Neither the name "Markdown" nor the names of its contributors may
 *    be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * This software is provided by the copyright holders and contributors "as
 * is" and any express or implied warranties, including, but not limited
 * to, the implied warranties of merchantability and fitness for a
 * particular purpose are disclaimed. In no event shall the copyright owner
 * or contributors be liable for any direct, indirect, incidental, special,
 * exemplary, or consequential damages (including, but not limited to,
 * procurement of substitute goods or services; loss of use, data, or
 * profits; or business interruption) however caused and on any theory of
 * liability, whether in contract, strict liability, or tort (including
 * negligence or otherwise) arising in any way out of the use of this
 * software, even if advised of the possibility of such damage.
 */
package com.bewsoftware.mdj.core;

public class HTMLToken {

    private final boolean isTag;
    private final String text;

    private HTMLToken(boolean tag, String value) {
        isTag = tag;
        text = value;
    }

    public static HTMLToken tag(String text) {
        return new HTMLToken(true, text);
    }

    public static HTMLToken text(String text) {
        return new HTMLToken(false, text);
    }

    /**
     * @return <code>true</code> if this is a tag, <code>false</code> if it's
     *         text.
     */
    public boolean isTag() {
        return isTag;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        String type;
        if (isTag())
        {
            type = "tag";
        } else
        {
            type = "text";
        }
        return type + ": " + getText();
    }
}
