
data class ExternalUrls(
    val spotify: String
)

data class Followers(
    val href: Any?,
    val total: Int
)

data class Image(
    val url: String,
    val height: Any?, // Height ve width nullable olabilir
    val width: Any?
)

data class Owner(
    val external_urls: ExternalUrls,
    val href: String,
    val id: String,
    val type: String,
    val uri: String,
    val display_name: String
)

data class PlaylistRequest(
    val name: String,
    val description: String,
    val public: Boolean
)

data class SpotifyUser(
    val country: String,
    val display_name: String,
    val email: String,
    val explicit_content: ExplicitContent,
    val external_urls: ExternalUrls,
    val followers: Followers,
    val href: String,
    val id: String,
    val images: List<Image>,
    val product: String,
    val type: String,
    val uri: String
)

data class ExplicitContent(
    val filter_enabled: Boolean,
    val filter_locked: Boolean
)

data class AddTracksRequest(
    val uris: List<String>,
    val position: Int
)

data class CreatePlaylistID(
    val id: String
)

data class Artist(
    val external_urls: ExternalUrls,
    val href: String,
    val id: String,
    val name: String,
    val type: String,
    val uri: String
)
data class Tracks(
    val items: List<Track>,
    val total: Int,
    val limit: Int
)
data class Track(
    val album: Album,
    val artists: List<Artist>,
    val available_markets: List<String>,
    val disc_number: Int,
    val duration_ms: Int,
    val explicit: Boolean,
    val external_urls: ExternalUrls,
    val href: String,
    val id: String,
    val name: String,
    val popularity: Int,
    val preview_url: String?,
    val track_number: Int,
    val type: String,
    val uri: String,
    val is_local: Boolean
)

data class Album(
    val href: String,
    val id: String,
    val images: List<Image>,
    val name: String,
    val type: String,
    val uri: String,
    val artists: List<Artist>,
    val tracks: Tracks,
    val genres: List<String>,
    val label: String,
    val popularity: Int
)
data class TrackResponse(
    val tracks: Tracks
)

data class TrackInfoList(val trackName: String, val imageUri: String, val trackUri: String, val artistName:String) // Track sınıfı tanımı

data class SpotifyTokenResponse(
    val access_token: String,
    val token_type: String,
    val scope: String,
    val expires_in: Int,
    val refresh_token: String
)

data class RefreshTokenResponse(
    val access_token: String,
    val token_type: String,
    val scope: String,
    val expires_in: Int,
    val refresh_token: String
)