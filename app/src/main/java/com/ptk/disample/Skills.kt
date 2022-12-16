package com.ptk.disample

data class Skills(val skillList:List<SkillModel>)

data class SkillModel(val skillName:String, val proficiencyRate:Int)