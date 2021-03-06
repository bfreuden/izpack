/*
 * IzPack - Copyright 2001-2012 Julien Ponge, All Rights Reserved.
 *
 * http://izpack.org/
 * http://izpack.codehaus.org/
 *
 * Copyright 2012 Tim Anderson
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.izforge.izpack.panels.userinput.field.radio;

import com.izforge.izpack.panels.userinput.field.Choice;

/**
 * Radio button choice.
 *
 * @author Tim Anderson
 */
public class RadioChoice extends Choice
{

    /**
     * Determines if the choice selection triggers re-validation.
     */
    private final boolean revalidate;


    /**
     * Constructs a {@code RadioChoice}.
     *
     * @param key        the key
     * @param value      the display value
     * @param revalidate if {@code true}, choice selection triggers re-validation
     */
    public RadioChoice(String key, String value, boolean revalidate)
    {
        super(key, value);
        this.revalidate = revalidate;
    }

    /**
     * Returns the 'true' value.
     *
     * @return the 'true' value
     */
    public String getTrueValue()
    {
        return getKey();
    }

    /**
     * Determines if the choice selection triggers re-validation.
     *
     * @return {@code true}, choice selection triggers re-validation
     */
    public boolean getRevalidate()
    {
        return revalidate;
    }
}
