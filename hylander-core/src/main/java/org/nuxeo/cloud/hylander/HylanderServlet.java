/*
 * (C) Copyright 2021 Nuxeo (http://nuxeo.com/) and others.
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
 *
 * Contributors:
 *     Frantz Fischer
 */

package org.nuxeo.cloud.hylander;

import java.io.IOException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.nuxeo.runtime.api.Framework;

import static org.nuxeo.cloud.hylander.Constants.HYLANDER_JSP;
import static org.nuxeo.cloud.hylander.Constants.MESSAGE_ATTRIBUTE;

/**
 * @since 11.5
 */

public class HylanderServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final Log log = LogFactory.getLog(HylanderServlet.class);

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.debug("[doGet] BEGIN");

        request.setAttribute(MESSAGE_ATTRIBUTE, "Hey! This is a test from Hyland!");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(HYLANDER_JSP);

        requestDispatcher.forward(request, response);
        log.debug("[doGet] END");
    }

    @Override
    public void init() throws ServletException {
        log.debug("[init] Loaded");
    }

}
