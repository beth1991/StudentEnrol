import com.studentenrol.*

class BootStrap{

	def init = { servletContext ->

		def course1 = new Course(title: 'Interactive Media with Animation',
			
			department:'Computing',
			
			description: '''Lorem ipsum dolor sit amet, ad sea solum brut sensibus, te summo senserit vix,mel reque corpora vulputate ei.''',

			leader:'Joe Jojo',

			code:'IMA101'

			startDate: new Date ('19/01/2015'),

			endDate: new Date ('19/01/2020')).save()

		
		def course2 = new Course(title: 'Web Systems Design',
			
			department:'Computing',
			
			description: '''Lorem ipsum dolor sit amet, ad sea solum brut sensibus, te summo senserit vix,mel reque corpora vulputate ei.''',

			leader:'John Smith',

			code:'WSD105'

			startDate: new Date ('19/01/2015'),

			endDate: new Date ('19/01/2020')).save()

		

		def course2 = new Course(title: 'Games Systems Design',
			
			department:'Computing',
			
			description: '''Lorem ipsum dolor sit amet, ad sea solum brut sensibus, te summo senserit vix,mel reque corpora vulputate ei.''',

			leader:'Jane Dove',

			code:'GSD101'

			startDate: new Date ('19/01/2015'),

			endDate: new Date ('19/01/2020')).save()

}

}

def destroy={
}

}
