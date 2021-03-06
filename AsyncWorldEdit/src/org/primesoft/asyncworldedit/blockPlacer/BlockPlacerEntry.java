/*
 * The MIT License
 *
 * Copyright 2013 SBPrime.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.primesoft.asyncworldedit.blockPlacer;

import org.primesoft.asyncworldedit.worldedit.AsyncEditSession;

/**
 *
 * @author SBPrime
 */
public abstract class BlockPlacerEntry {
    private final int m_jobId;    
    protected final AsyncEditSession m_editSession;

    /**
     * Is this task demanding
     * @return 
     */
    public abstract boolean isDemanding();
    
    /**
     * The job ID
     * @return 
     */
    public int getJobId(){
        return m_jobId;
    }
    
    
    /**
     * Job edit session
     * @return 
     */
    public AsyncEditSession getEditSession() {
        return m_editSession;
    }
    
    
    /**
     * Process the entry
     */
    public abstract void Process(BlockPlacer bp);

    public BlockPlacerEntry(AsyncEditSession editSession, int jobId) {
        m_editSession = editSession;
        m_jobId = jobId;
    }
}
