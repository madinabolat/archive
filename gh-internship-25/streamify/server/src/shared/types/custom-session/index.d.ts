//import '@/shared/types/custom-session'
import '@/shared/types/express-session'
import type { SessionMetadata } from '../session-metadata.types'

declare module 'express-session' {
	interface SessionData {
		userId?: string
		createdAt?: Date | string
		metadata: SessionMetadata
	}
}
