/*******************************************************************************
 * UW SPF - The University of Washington Semantic Parsing Framework
 * <p>
 * Copyright (C) 2013 Yoav Artzi
 * <p>
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or any later version.
 * <p>
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * <p>
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 ******************************************************************************/
package edu.uw.cs.lil.tiny.parser.joint.injective;

import java.util.List;

import edu.uw.cs.lil.tiny.parser.IParserOutput;
import edu.uw.cs.lil.tiny.parser.joint.IJointDerivation;

/**
 * @author Yoav Artzi
 * @param <MR>
 *            Formal meaning representation.
 * @param <ERESULT>
 *            Evaluation of semantic result.
 * @see AbstractInjectiveJointOutput
 */
public class InjectiveJointOutput<MR, ERESULT>
		extends
		AbstractInjectiveJointOutput<MR, ERESULT, IJointDerivation<MR, ERESULT>> {
	
	private final IParserOutput<MR>	baseParserOutput;
	
	public InjectiveJointOutput(IParserOutput<MR> baseParserOutput,
			List<IJointDerivation<MR, ERESULT>> jointParses,
			long inferenceTime, boolean exactEvaluation) {
		super(jointParses, inferenceTime, exactEvaluation
				&& baseParserOutput.isExact());
		this.baseParserOutput = baseParserOutput;
	}
	
	@Override
	public IParserOutput<MR> getBaseParserOutput() {
		return baseParserOutput;
	}
	
	@Override
	public boolean isExact() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
