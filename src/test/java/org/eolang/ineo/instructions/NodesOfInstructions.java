/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016-2023 Objectionary.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.eolang.ineo.instructions;

import com.jcabi.xml.XML;
import com.jcabi.xml.XMLDocument;
import org.cactoos.list.ListEnvelope;
import org.xembly.Xembler;

/**
 * List of nodes of given instructions by provided xpath.
 * @param <T> Type of instructions
 * @since 0.0.1
 */
final class NodesOfInstructions<T> extends ListEnvelope<XML> {
    /**
     * Ctor.
     * @param instructions Instructions
     * @param xpath Xpath
     */
    NodesOfInstructions(final Instructions<T> instructions, final String xpath) {
        super(
            new XMLDocument(
                new Xembler(
                    instructions
                ).domQuietly()
            ).nodes(xpath)
        );
    }
}
