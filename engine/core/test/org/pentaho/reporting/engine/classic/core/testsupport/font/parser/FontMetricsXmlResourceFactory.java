/*
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2007 - 2009 Pentaho Corporation,  ..  All rights reserved.
 */

package org.pentaho.reporting.engine.classic.core.testsupport.font.parser;

import org.pentaho.reporting.engine.classic.core.ClassicEngineBoot;
import org.pentaho.reporting.libraries.base.config.Configuration;
import org.pentaho.reporting.libraries.xmlns.parser.AbstractXmlResourceFactory;

public class FontMetricsXmlResourceFactory extends AbstractXmlResourceFactory
{
  public FontMetricsXmlResourceFactory()
  {
    registerModule(new FontMetricsXmlFactoryModule());
  }

  public void initializeDefaults()
  {
  }

  protected Configuration getConfiguration()
  {
    return ClassicEngineBoot.getInstance().getGlobalConfig();
  }

  public Class getFactoryType()
  {
    return FontMetricsCollection.class;
  }
}